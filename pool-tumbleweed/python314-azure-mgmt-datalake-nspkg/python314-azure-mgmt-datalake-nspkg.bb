SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-azure-mgmt-datalake-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "393367eda6acdda7233ff7aa8de1cf8ebbb3367cc96e3708d92060e89f8f3cfe3929455f61289a66a319197a2f185234cb1281cd9fb4288e6e3ffcb78bbb37e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-datalake-nspkg \
python314-azure-mgmt-datalake-nspkg \
python3dist-azure-mgmt-datalake-nspkg"

RDEPENDS:${PN} += "python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
