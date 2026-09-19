SUMMARY = "Url wrapper for kanku:// urls"
DESCRIPTION = "A URL wrapper to start kanku from kanku:// urls in the browser."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-urlwrapper-1.0.0-2.2.noarch.rpm"
RPM_HASH = "883c7b227e3f490d568af2de8ac463f52a1f0dd9247a1528c8182bdb9fdb7154da5d0f401802757c281c04e0852beec18e2681919466294f70252ff72ee3ca78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-urlwrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
kanku-cli \
shared-mime-info"

inherit rpm
