SUMMARY = "Microsoft Corporation Azure Keyvault Securitydomain Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
* Managed HSM security domain management (this library) - securely \
  download and restore a managed HSM's security domain \
* Cryptographic key management (azure-keyvault-keys)- create, store, \
  and control access to the keys used to encrypt your data \
* Secrets management (azure-keyvault-secrets) - securely store and \
  control access to tokens, passwords, certificates, API keys, and \
  other secrets \
* Certificate management (azure-keyvault-certificates) - create, manage, \
  and deploy public and private SSL/TLS certificates \
* Vault administration (azure-keyvault-administration) - role-based access \
  control (RBAC), and vault-level backup and restore options"
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-keyvault-securitydomain-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "5aa62b9058526ad9e4c0eac319c094148140d7af831674d8a9c07a56a319d006b3f6a217653fc93c314b4733c4eab6adf02ef5734cb121c55e64549bef93a7e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-securitydomain \
python3.13dist-azure-keyvault-securitydomain \
python313-azure-keyvault-securitydomain \
python3dist-azure-keyvault-securitydomain"

RDEPENDS:${PN} += "-python313-azure-core >= 1.31.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-keyvault-nspkg \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
