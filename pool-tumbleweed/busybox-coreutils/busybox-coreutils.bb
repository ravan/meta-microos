SUMMARY = "Busybox applets replacing coreutils"
DESCRIPTION = "This package contains the symlinks to replace coreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-coreutils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "38fb07f20d98990722ff384cec746841cdcb59d343d28345b6062fc9a5bacd18eae9a2f220ef6f60444d6031e5da4e3d3f17c4d287bc2c4d6adcda57f831a9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/cat \
/usr/bin/chgrp \
/usr/bin/chmod \
/usr/bin/chown \
/usr/bin/cp \
/usr/bin/dd \
/usr/bin/df \
/usr/bin/echo \
/usr/bin/false \
/usr/bin/ln \
/usr/bin/ls \
/usr/bin/mkdir \
/usr/bin/mknod \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/pwd \
/usr/bin/rm \
/usr/bin/rmdir \
/usr/bin/sleep \
/usr/bin/sort \
/usr/bin/stty \
/usr/bin/sync \
/usr/bin/touch \
/usr/bin/true \
/usr/bin/uname \
busybox-coreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
