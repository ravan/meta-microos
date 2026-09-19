SUMMARY = "Kwin integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the KDE Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-fenet-kwin-0.6.70+git.18808.g3467692359-3.1.noarch.rpm"
RPM_HASH = "75102d3463e53884d9dc7b7c543bf3bc6ed09ab51901eb2112990ebce21239b9e38d641bdbac9ec2eb35915955f38b27cbb4cb27d82860102e9a23c05117ff4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-kwin \
leechcraft-fenet-wm"

RDEPENDS:${PN} += "/usr/bin/sh \
kwin6-x11 \
leechcraft-fenet"

inherit rpm
