SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python313-zignal-0.7.0-1.10.noarch.rpm"
RPM_HASH = "ffbf50ae9f9c6a2ecb386dcda737a184a4a23fd609d3af0dc2560e2a9e047d173f8c3f70d133e14d2e43ac3bf82c36060879123733b45585b15a94b7058fa434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zignal \
python3.13dist-zignal \
python313-zignal \
python3dist-zignal"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-matplotlib \
python313-numpy \
python313-samplerate \
python313-scipy \
update-alternatives"

inherit rpm
