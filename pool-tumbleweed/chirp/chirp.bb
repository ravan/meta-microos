SUMMARY = "Tool for programming amateur radio sets"
DESCRIPTION = "CHIRP is a free, open-source tool for programming your amateur radio. It \
supports a large number of manufacturers and models, as well as provides \
a way to interface with multiple data sources and formats."
LICENSE = "GPL-3.0-only"

PV = "20260911"

RPM_NAME = "chirp-20260911-1.1.noarch.rpm"
RPM_HASH = "043570f1f3fdc88da600d795369d7d4df8e306b381679b97502a00030f49badc86352de246869d57d3add97aeb6bfc208ffc96cf95ee25bd50ccd1c7291dcc5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chirp \
python3.13dist-chirp \
python3dist-chirp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-lark \
python3-pyserial \
python3-requests \
python3-suds \
python3-wxPython \
python3-yattag"

inherit rpm
