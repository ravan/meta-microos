SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python313-yarg-0.1.10-1.9.noarch.rpm"
RPM_HASH = "6e0e64c458a2c4b600e34a4da290f87c6f28821bbfa4fd18b189abfbc0060bf83cd6563479e184295745bab823fbd63b265d8a5eea1c30edd08c4a07ea485a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yarg \
python3.13dist-yarg \
python313-yarg \
python3dist-yarg"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
