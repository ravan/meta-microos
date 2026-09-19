SUMMARY = "Microsoft Azure Key Vault Administration Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
Certificate management (this library) - create, manage, and deploy public and \
private SSL/TLS administration Cryptographic key management (azure-keyvault-keys) \
- create, store, and control access to the keys used to encrypt your data Secrets \
management (azure-keyvault-secrets) - securely store and control access to tokens, \
passwords, administration, API keys, and other secrets."
LICENSE = "MIT"

PV = "4.8.0~b2"

RPM_NAME = "python314-azure-keyvault-administration-4.8.0~b2-1.1.noarch.rpm"
RPM_HASH = "eec48c173e6bc078e9b6bb03e4ccbf78bd1897c3c0e88e0a9f5aca0dd343c7c2b7b2b70804ace5802af7ea7868fad940d611d295bd9f8a4d70fc8aea158c673f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-keyvault-administration \
python314-azure-keyvault-administration \
python3dist-azure-keyvault-administration"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.31.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-keyvault-nspkg \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
