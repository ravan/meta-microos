SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-data-nspkg-1.0.0-4.9.noarch.rpm"
RPM_HASH = "ff4693dd09615d84e4262d0a7bf002d88211ae343348618d766bfde4e1abcdc1b817d38ea6818a049752f8d6fbead23e9ce79fe1d5cd3f4a7a504e1c5cf0cc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-data-nspkg \
python314-azure-data-nspkg \
python3dist-azure-data-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
