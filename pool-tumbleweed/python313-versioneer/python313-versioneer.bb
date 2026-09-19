SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.29"

RPM_NAME = "python313-versioneer-0.29-3.1.noarch.rpm"
RPM_HASH = "ab51d44ab89318754cfb6843846479d52ee6b46e2b235c5dcb6c5991878405d02fd58a4267b2c970b53791db3bd66a5825fcceaf9069d1f3aae7b254f0af166a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioneer \
python3.13dist-versioneer \
python313-versioneer \
python3dist-versioneer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
