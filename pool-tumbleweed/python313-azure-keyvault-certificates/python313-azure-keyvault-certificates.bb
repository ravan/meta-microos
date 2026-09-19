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

RPM_NAME = "python313-azure-keyvault-certificates-4.11.2-1.1.noarch.rpm"
RPM_HASH = "3d5ec23254ee293b1fa7acd7303b20ce972fc3991bf77f1176b91bba673d00836c51b88f9c585ae821a85178c0de60fbeed622ed43abfe9c8c80f88b33e1f655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-certificates \
python3.13dist-azure-keyvault-certificates \
python313-azure-keyvault-certificates \
python3dist-azure-keyvault-certificates"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.31.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-keyvault-nspkg \
python313-azure-nspkg \
python313-cryptography \
python313-isodate \
python313-typing-extensions"

inherit rpm
