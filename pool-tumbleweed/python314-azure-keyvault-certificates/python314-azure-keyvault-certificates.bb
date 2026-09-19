SUMMARY = "Microsoft Azure Key Vault Certificates Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
Certificate management (this library) - create, manage, and deploy public and \
private SSL/TLS certificates Cryptographic key management (azure-keyvault-keys) \
- create, store, and control access to the keys used to encrypt your data Secrets \
management (azure-keyvault-secrets) - securely store and control access to tokens, \
passwords, certificates, API keys, and other secrets."
LICENSE = "MIT"

PV = "4.11.2"

RPM_NAME = "python314-azure-keyvault-certificates-4.11.2-1.1.noarch.rpm"
RPM_HASH = "5828d9bdb04c1d5157ac198c528d7a0b631fe19a52185e3904aa24fdad5b545667b3b1242eda33eebec403367aed9ffbd94f2037476ddde1ae50b5fe5c3ad2c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-keyvault-certificates \
python314-azure-keyvault-certificates \
python3dist-azure-keyvault-certificates"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.31.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-keyvault-nspkg \
python314-azure-nspkg \
python314-cryptography \
python314-isodate \
python314-typing-extensions"

inherit rpm
