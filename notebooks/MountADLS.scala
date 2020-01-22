// Databricks notebook source
// MAGIC %scala
// MAGIC val configs = Map(
// MAGIC   "fs.azure.account.auth.type" -> "OAuth",
// MAGIC   "fs.azure.account.oauth.provider.type" -> "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider",
// MAGIC   "fs.azure.account.oauth2.client.id" -> "462dedbd-2363-4941-b497-0c2f9d23cb5d",
// MAGIC   "fs.azure.account.oauth2.client.secret" -> dbutils.secrets.get(scope="AKV", key="dlstoken"),
// MAGIC   "fs.azure.account.oauth2.client.endpoint" -> "https://login.microsoftonline.com/72f988bf-86f1-41af-91ab-2d7cd011db47/oauth2/token")
// MAGIC dbutils.fs.mount(
// MAGIC   source = "abfss://data@rachitstoragetraining.dfs.core.windows.net/",
// MAGIC   mountPoint = "/mnt/data",
// MAGIC   extraConfigs = configs)

// COMMAND ----------

// MAGIC %fs
// MAGIC ls /mnt/data