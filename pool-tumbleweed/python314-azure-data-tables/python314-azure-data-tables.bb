SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.7.0"

RPM_NAME = "python314-azure-data-tables-12.7.0-1.5.noarch.rpm"
RPM_HASH = "08b1ba5232e06f5324d1c8902eec102f9e3028cd1642d702fcb130eb0489fe1065ae190b29f764d82cfd033c261203f0325969068f88a645ea610766bd500b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-data-tables \
python314-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "-python314-azure-core >= 1.29.4 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
-python314-yarl >= 1.0 with python314-yarl < 2.0 \
python-abi \
python314-azure-data-nspkg \
python314-azure-nspkg"

inherit rpm
