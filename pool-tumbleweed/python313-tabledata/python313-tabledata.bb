SUMMARY = "Python library to represent tabular data"
DESCRIPTION = "tabledata is a Python library to represent tabular data."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "python313-tabledata-1.3.5-1.2.noarch.rpm"
RPM_HASH = "9f66bed579ba34f0754cf4d9773471d9ceb70a912f8834b9f5b7b58bb59fc6209182e22dd268461a3cef0ec634f613d964c71788a01f35020732cf98a3ed1d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabledata \
python3.13dist-tabledata \
python313-tabledata \
python3dist-tabledata"

RDEPENDS:${PN} += "python-abi \
python313-DataProperty \
python313-typepy"

inherit rpm
