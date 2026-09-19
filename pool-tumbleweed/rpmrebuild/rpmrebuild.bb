SUMMARY = "A tool to build a rpm file from the rpm database"
DESCRIPTION = "rpmrebuild allows to build an rpm file from an installed rpm, or from another \
rpm file, with or without changes (batch or interactive). It can be extended by \
a plugin system. A typical use is to easy repackage a software after some \
configuration's change."
LICENSE = "GPL-2.0-or-later"

PV = "2.21"

RPM_NAME = "rpmrebuild-2.21-1.3.noarch.rpm"
RPM_HASH = "7394d09fa116fc3f41ebaae7646e9c5b54e88db128f869fc61cfda1cb1736c66cddaea5ea400945ea54410bf2f854fc1c32fa714c5b9cbd876da212332b2b719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmrebuild"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
coreutils \
cpio \
rpm-build \
sed"

inherit rpm
