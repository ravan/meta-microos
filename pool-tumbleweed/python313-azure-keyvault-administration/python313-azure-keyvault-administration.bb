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

RPM_NAME = "python313-azure-keyvault-administration-4.8.0~b2-1.1.noarch.rpm"
RPM_HASH = "cb397d0e77064df7beb7f74c0a1f2f34af86f48d1745829b7df6e9848220d49b29d532680d6ee4cd58b8d0eea8df1b3bfbfe86bfcdd5bea6eb793ed6a7aa6250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-administration \
python3.13dist-azure-keyvault-administration \
python313-azure-keyvault-administration \
python3dist-azure-keyvault-administration"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.31.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-keyvault-nspkg \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
