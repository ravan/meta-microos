SUMMARY = "Microsoft Azure Key Vault Keys Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
 * Cryptographic key management (this library) - create, store, \
   and control access to the keys used to encrypt your data \
 * Secrets management (azure-keyvault-secrets) - securely store \
   and control access to tokens, passwords, certificates, API \
   keys, and other secrets \
 * Certificate management (azure-keyvault-certificates) - create, \
   manage, and deploy public and private SSL/TLS certificates"
LICENSE = "MIT"

PV = "4.12.0~b3"

RPM_NAME = "python313-azure-keyvault-keys-4.12.0~b3-1.1.noarch.rpm"
RPM_HASH = "acf74a41f0b82317030d75a4d594ab398e2100f8c2d4910dca36ecf094f869bac54486b1a440df5b938d24a7da7ce68288a969e01913657d63309f191fcccdf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-keys \
python3.13dist-azure-keyvault-keys \
python313-azure-keyvault-keys \
python3dist-azure-keyvault-keys"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.37.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-keyvault-nspkg \
python313-azure-nspkg \
python313-cryptography \
python313-isodate \
python313-typing-extensions"

inherit rpm
