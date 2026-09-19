SUMMARY = "Development files for golly"
DESCRIPTION = "This package contains header files and libraries needed to develop applications \
that use golly."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "golly-devel-5.0-2.1.aarch64.rpm"
RPM_HASH = "06e5fbc2e5357cd6c7521122616461d4fbc5b2b783c6c647cb48708c9361e56e4a0470e84cb6c214e8655b8551e273c37f71d794cdc41833008d951e45a8f440"

RPROVIDES:${PN} += "golly-devel"

RDEPENDS:${PN} += "golly"

inherit rpm
