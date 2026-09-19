SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-datalake-store-1.0.1-1.5.noarch.rpm"
RPM_HASH = "67ba27356a453f032a33c2374df20fc5437d1a72f538314b10cc1db4b0f975d9aef726d400cc66511891c8e69b67dc7898670c0324dd835aed976116f7201a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-datalake-store \
python3.13dist-azure-datalake-store \
python313-azure-datalake-store \
python3dist-azure-datalake-store"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg \
python313-cffi \
python313-requests"

inherit rpm
