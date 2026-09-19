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

RPM_NAME = "python314-azure-keyvault-securitydomain-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "f20b18d9f54815d28cea925fbfde764386abbd5ed0620c414ba777b2e038a1ef5571073cf6d7bc6e5bd45e192115f3a09ef4e3525bb93221c40a3114a144d353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-keyvault-securitydomain \
python314-azure-keyvault-securitydomain \
python3dist-azure-keyvault-securitydomain"

RDEPENDS:${PN} += "-python314-azure-core >= 1.31.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-keyvault-nspkg \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
