SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python313-DataProperty-1.1.1-1.2.noarch.rpm"
RPM_HASH = "3b8fff167089526694205bbece527d5f080fa37ff1d7d85b2241159bd89c3a35ae5fef267ee790041b09f7fb5fb1e1a1a3112bd611c107fdacc1ebb616d1aaf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DataProperty \
python3.13dist-dataproperty \
python313-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python313-mbstrdecoder \
python313-typepy"

inherit rpm
