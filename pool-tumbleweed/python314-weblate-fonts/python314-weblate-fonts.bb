SUMMARY = "Weblate fonts collection"
DESCRIPTION = "Fonts used in Weblate. \
 \
Sources are available at <https://github.com/WeblateOrg/fonts>."
LICENSE = "CC0-1.0 & OFL-1.1"

PV = "2026.1"

RPM_NAME = "python314-weblate-fonts-2026.1-1.5.noarch.rpm"
RPM_HASH = "5b5c056186529cec3abd7d8b8ba18c7754b4b97e836b6441139df0c07f0dac22fc38617582e96e2086e4dfbfaae679b54d60e618f0ff19ec2b2133f14f1e960d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-weblate-fonts \
python314-weblate-fonts \
python3dist-weblate-fonts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
