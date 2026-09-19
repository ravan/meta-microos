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

RPM_NAME = "python313-azure-keyvault-secrets-4.11.2-1.1.noarch.rpm"
RPM_HASH = "c5307e67a3b909261d6b108c64dc7516b4b1f24f023cd1a01d46e2a1b2d5d7c1db8d5bef78926f6b3500c726d1b896e3910f1645aabd88fde29c426440194118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-secrets \
python3.13dist-azure-keyvault-secrets \
python313-azure-keyvault-secrets \
python3dist-azure-keyvault-secrets"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.31.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-keyvault-nspkg \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
