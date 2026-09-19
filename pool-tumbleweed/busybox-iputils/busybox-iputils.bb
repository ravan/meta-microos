SUMMARY = "Busybox applets replacing iputils"
DESCRIPTION = "This package contains the symlinks to replace iputils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-iputils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "005e341c7c1c4b3a1278ce7c4edf238ca840556d97ad8e953ec325fa3739c23032d1e49a345f48938a8732d057f8456d5f70711874c5fb1bb4032bcf067888ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ping \
busybox-iputils"

RDEPENDS:${PN} += "busybox"

inherit rpm
