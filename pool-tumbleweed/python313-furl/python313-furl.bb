SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.4"

RPM_NAME = "python313-furl-2.1.4-1.5.noarch.rpm"
RPM_HASH = "c7ecfaa414cf1a1250bede816588c10ba2ddc61de792ae14ad1d2878b365de102dda7db10cdf7c443a236095ea5001cb67f2d70ebb7188d0de9dc43d41517f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-furl \
python3.13dist-furl \
python313-furl \
python3dist-furl"

RDEPENDS:${PN} += "python-abi \
python313-orderedmultidict"

inherit rpm
