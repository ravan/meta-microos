SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python314-DataProperty-1.1.1-1.2.noarch.rpm"
RPM_HASH = "47d20bfe15f0dfddd14df65da25107001c8b5b46d48457e335ae8bffd5ab3525c9ce2b73ab9ad64918bec9eb25efb01ebe08aea89bd3b9c09a4530a06303306b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dataproperty \
python314-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python314-mbstrdecoder \
python314-typepy"

inherit rpm
