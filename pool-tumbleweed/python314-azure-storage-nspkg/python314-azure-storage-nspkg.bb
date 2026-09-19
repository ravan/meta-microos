SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-azure-storage-nspkg-3.1.0-4.9.noarch.rpm"
RPM_HASH = "f419bb18902d743721faaaaeb4585f6bc5430d857aec0b29049e76f0f4da8bc2ebcf7c79a1a38226de3d8f520b7b95d86fb92f7768190bf771750939f1905e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-nspkg \
python314-azure-storage-nspkg \
python3dist-azure-storage-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
