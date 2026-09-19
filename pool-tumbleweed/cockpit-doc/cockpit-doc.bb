SUMMARY = "Cockpit deployment and developer guide"
DESCRIPTION = "The Cockpit Deployment and Developer Guide shows sysadmins how to \
deploy Cockpit on their machines as well as helps developers who want to \
embed or extend Cockpit."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-doc-365-2.1.noarch.rpm"
RPM_HASH = "073898fe903e3f832ad54d668058bd0ccb65bc2d6f6241c817bc9bb1049b8afddd6a60c4601807c0b2351d42fd1980ef7025851a6c1a50196dfe749b071e8db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-doc"

RDEPENDS:${PN} += ""

inherit rpm
