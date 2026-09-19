SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python313-findpython-0.8.0-1.2.noarch.rpm"
RPM_HASH = "927d09f395b1eaaa458c1bd0de4ce59f233df985c37aca86a352131c7e1d6caaa4fd1046fcf675c61187fedb4a51ce17a01518d0461bd5d78278e59d20497027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-findpython \
python3.13dist-findpython \
python313-findpython \
python3dist-findpython"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-packaging \
python313-platformdirs \
update-alternatives"

inherit rpm
