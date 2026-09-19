SUMMARY = "Microsoft Azure Computebulkactions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computebulkactions Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-computebulkactions-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "de207962d591e3ced4cc433c964801d2c256da3a87c353d0617e5962b73bfea997e4bf742eb93d686502bfb2b060633eb525a4d6dbd6cd210a917841d9a9d026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-computebulkactions \
python314-azure-mgmt-computebulkactions \
python3dist-azure-mgmt-computebulkactions"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
