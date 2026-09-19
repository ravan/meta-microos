SUMMARY = "A simple library to convert rtf to text"
DESCRIPTION = "A simple library to convert rtf to text."
LICENSE = "BSD-3-Clause"

PV = "0.0.33"

RPM_NAME = "python313-striprtf-0.0.33-1.1.noarch.rpm"
RPM_HASH = "f153c0ba8f729ca0a05e045f1e51b742315dd0d30598628c5babbf71588bb35dc1ee6a6bdd12514178b30f73d54b5924cf2cd9176ee0efb7d0bf59884ff45fe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-striprtf \
python3.13dist-striprtf \
python313-striprtf \
python3dist-striprtf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
