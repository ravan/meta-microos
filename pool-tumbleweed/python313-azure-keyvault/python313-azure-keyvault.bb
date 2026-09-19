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

RPM_NAME = "python313-azure-keyvault-4.2.0-3.9.noarch.rpm"
RPM_HASH = "9e4765875e0813c6aa16ae36ac4b9f46c81be257664df6a7d9c9cf63ba4b49880888b54a02389a732e3684fdb730fc793af3cde4bd72babccb1f8faf478a9d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault \
python3.13dist-azure-keyvault \
python313-azure-keyvault \
python3dist-azure-keyvault"

RDEPENDS:${PN} += "python313-azure-keyvault-certificates \
python313-azure-keyvault-keys \
python313-azure-keyvault-nspkg \
python313-azure-keyvault-secrets \
python313-azure-nspkg"

inherit rpm
