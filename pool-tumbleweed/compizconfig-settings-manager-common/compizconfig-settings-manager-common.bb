SUMMARY = "Settings Manager for Compiz -- Common files"
DESCRIPTION = "Common files for the Compiz Config and Settings tool (CCSM)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compizconfig-settings-manager-common-0.8.18-3.3.noarch.rpm"
RPM_HASH = "682e903d71f8ec6730b642e5ac4b05a037abfc619abde5ea0e0f87f282254d5fd31a65dc59ef0b3bd79c92aff674a00fc0effabd4158ed68ae74bbb27961d5a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compizconfig-settings-manager-common"

RDEPENDS:${PN} += ""

inherit rpm
