SUMMARY = "Microsoft Azure Key Vault Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault libraries bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide APIs for Key Vault operations: \
 \
- azure-keyvault-keys \
- azure-keyvault-secrets \
- azure-keyvault-certificates"
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python314-azure-keyvault-4.2.0-3.9.noarch.rpm"
RPM_HASH = "190279174db7677df65ab24169e046095cdcd6065b517ec4cf604e0f59e7d7a22311a57bda8eb1d8c1477bb5174e8db4b3b6a64a08c5326319c9dae464676043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-keyvault \
python314-azure-keyvault \
python3dist-azure-keyvault"

RDEPENDS:${PN} += "python314-azure-keyvault-certificates \
python314-azure-keyvault-keys \
python314-azure-keyvault-nspkg \
python314-azure-keyvault-secrets \
python314-azure-nspkg"

inherit rpm
