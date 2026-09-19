SUMMARY = "A small Python module to parse various kinds of time expressions"
DESCRIPTION = "A small Python module to parse various kinds of time expressions. Developed separately from the original."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python313-pytimeparse2-1.7.1-2.5.noarch.rpm"
RPM_HASH = "a0e8207b9a3c916731b9a174892243732ef373471c7e55f043a222551abd111b3737b3688f9740be26576714d15b4518cdb1f033e56ac2a018ef3446bcb15d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytimeparse2 \
python3.13dist-pytimeparse2 \
python313-pytimeparse2 \
python3dist-pytimeparse2"

RDEPENDS:${PN} += "python-abi \
python3-base"

inherit rpm
