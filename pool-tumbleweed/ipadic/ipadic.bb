SUMMARY = "Standard Japanese Dictionary for ChaSen"
DESCRIPTION = "Standard Japanese dictionary for ChaSen."
LICENSE = "SUSE-Permissive"

PV = "2.7.0"

RPM_NAME = "ipadic-2.7.0-1.14.noarch.rpm"
RPM_HASH = "1914f1f478188c20802ed542dba4d5db4b1ac6ec8503ed226f1162d9843c67e8e8b8e90f0a9367a59cf2dce27cfad4dbbeac24f63db634ab071ebd37286b566a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ipadic \
ipadic"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
