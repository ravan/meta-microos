SUMMARY = "OpenSFX replacement sounds for OpenTTD"
DESCRIPTION = "OpenSFX replacement sounds for OpenTTD. The last required step \
to make OpenTTD independent."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & CDDL-1.1"

PV = "1.0.3"

RPM_NAME = "openttd-opensfx-1.0.3-1.14.noarch.rpm"
RPM_HASH = "59414a34d10b28e85ddabc2c75ae08ed254af4ab0783ccc8f7b3b8fedfe409a699fb26eebbfabeedfda04e4044cbc6e175a95460382b37503083a3a1ed5f1c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensfx \
openttd-opensfx"

RDEPENDS:${PN} += "openttd-data"

inherit rpm
