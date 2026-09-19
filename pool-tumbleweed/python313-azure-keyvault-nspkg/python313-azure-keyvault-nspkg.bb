SUMMARY = "Microsoft Azure Key Vault Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Key Vault namespace package. It isn't intended to be \
installed directly. Key Vault client libraries are located elsewhere: \
 \
* azure-keyvault-certificates \
* azure-keyvault-keys \
* azure-keyvault-secrets \
 \
This package is for Python 2 only. It provides the necessary files for other packages \
to extend the azure namespace. Python 3.x libraries use PEP420 instead."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-keyvault-nspkg-1.0.0-5.9.noarch.rpm"
RPM_HASH = "fee79e25f0688f754f7a44f01e685072617b1c814adf9a7f7950c8536ba1dba1d93b336e222901b8893ac873fb2522d20b75cf88b7da38d3798234766fe6e970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-nspkg \
python3.13dist-azure-keyvault-nspkg \
python313-azure-keyvault-nspkg \
python3dist-azure-keyvault-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
