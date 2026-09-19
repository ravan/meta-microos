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

RPM_NAME = "python314-azure-keyvault-keys-4.12.0~b3-1.1.noarch.rpm"
RPM_HASH = "3384ba7075e5b69920465d402a833caf566400ed3fc1cd1a54c0a9b55dfdea3ecaed9fda26774359d1c0e8b811a397aa9c741964ab74d3e11784f9868b13ba86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-keyvault-keys \
python314-azure-keyvault-keys \
python3dist-azure-keyvault-keys"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.37.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-keyvault-nspkg \
python314-azure-nspkg \
python314-cryptography \
python314-isodate \
python314-typing-extensions"

inherit rpm
