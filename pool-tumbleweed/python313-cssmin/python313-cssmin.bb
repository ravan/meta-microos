SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python313-cssmin-0.2.0-3.5.noarch.rpm"
RPM_HASH = "38d9135a3d761760388933e57e4596e54f3482b5c12fbc032eda4c8f24b19a3e21055ba334f618d5a1bf90f0afe2e1cfe985e2526efc4cd081b1213c2a992d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssmin \
python3.13dist-cssmin \
python313-cssmin \
python3dist-cssmin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
