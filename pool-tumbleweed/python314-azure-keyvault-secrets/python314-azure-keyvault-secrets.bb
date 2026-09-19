SUMMARY = "Microsoft Azure Key Vault Secrets Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
* Secrets management (this library) - securely store and control \
  access to tokens, passwords, certificates, API keys, and other secrets \
* Cryptographic key management (azure-keyvault-keys) - create, store, \
  and control access to the keys used to encrypt your data \
* Certificate management (azure-keyvault-certificates) - create, \
  manage, and deploy public and private SSL/TLS certificates"
LICENSE = "MIT"

PV = "4.11.2"

RPM_NAME = "python314-azure-keyvault-secrets-4.11.2-1.1.noarch.rpm"
RPM_HASH = "e185fd9a9cd4d88c37c2afa545879fa98bbb2828c723aa7a531d0a3b5e97d807f992e9391935553335eef2d8d9c4f257655143f25eb37a18e370d965fa1c26cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-keyvault-secrets \
python314-azure-keyvault-secrets \
python3dist-azure-keyvault-secrets"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.31.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-keyvault-nspkg \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
