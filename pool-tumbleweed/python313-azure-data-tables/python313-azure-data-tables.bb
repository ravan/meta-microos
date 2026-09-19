SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.7.0"

RPM_NAME = "python313-azure-data-tables-12.7.0-1.5.noarch.rpm"
RPM_HASH = "4ce21512d1edf91eab09d0ed5bc87c9f9287f2c0635aa7ffa48a45c496bbf6c8ce2f4c87a54ff2e4521137a8af6fc6b795574470ff1ff8a1fc06e976444b7ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-data-tables \
python3.13dist-azure-data-tables \
python313-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "-python313-azure-core >= 1.29.4 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
-python313-yarl >= 1.0 with python313-yarl < 2.0 \
python-abi \
python313-azure-data-nspkg \
python313-azure-nspkg"

inherit rpm
