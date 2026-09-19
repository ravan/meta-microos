SUMMARY = "Automagic shell tab completion for Python CLI applications"
DESCRIPTION = "Automagic shell tab completion for Python CLI applications"
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "python314-shtab-1.12.1-1.1.noarch.rpm"
RPM_HASH = "d05c238b115d37162cf2607b553161d006b5c5f6c931ead1d61f178d45a1ad397bca2c9c1df8f180703b617753f1a075f73c913660867e24f93514db7294daa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shtab \
python314-shtab \
python3dist-shtab"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
