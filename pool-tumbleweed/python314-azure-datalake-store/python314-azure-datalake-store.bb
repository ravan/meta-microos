SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-datalake-store-1.0.1-1.5.noarch.rpm"
RPM_HASH = "482381b306e26da1460c847385151740fda283788541d7eff3f2386bf8807ade75ae779489dac7f6bd36f410a295bb3a8e5baafdc02ca27392a043a1779e6634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-datalake-store \
python314-azure-datalake-store \
python3dist-azure-datalake-store"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg \
python314-cffi \
python314-requests"

inherit rpm
