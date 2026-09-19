SUMMARY = "Make asynchat available for Python 312 onwards"
DESCRIPTION = "Make asynchat available for Python 3.12 onwards"
LICENSE = "PSF-2.0"

PV = "1.0.5"

RPM_NAME = "python314-pyasynchat-1.0.5-1.3.noarch.rpm"
RPM_HASH = "a000b3db0c51b7d5430fb68200bb0aecce88f0f79a357c126fc4089a37b973728e71df65ab740810ef1cfd4fcc06e602d62a1c6d2974e6fde849f52abeaebce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyasynchat \
python314-pyasynchat \
python3dist-pyasynchat"

RDEPENDS:${PN} += "python-abi \
python314-pyasyncore"

inherit rpm
