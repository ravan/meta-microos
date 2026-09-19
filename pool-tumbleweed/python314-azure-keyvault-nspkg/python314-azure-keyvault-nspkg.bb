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

RPM_NAME = "python314-azure-keyvault-nspkg-1.0.0-5.9.noarch.rpm"
RPM_HASH = "0d55da46894cfd2cab901313a4103128b4f273c2aec5cd899b6cb4342aa30df68241e658a71d86613c6d319b6acd00cc35dcf57a2f369db553e1124f64d77d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-keyvault-nspkg \
python314-azure-keyvault-nspkg \
python3dist-azure-keyvault-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
