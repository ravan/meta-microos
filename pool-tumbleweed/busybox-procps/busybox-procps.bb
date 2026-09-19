SUMMARY = "Busybox applets replacing procps"
DESCRIPTION = "This package contains the symlinks to replace procps with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-procps-1.38.0-42.2.noarch.rpm"
RPM_HASH = "48ab630313a03b41a69ebc2a44ea204531d57f782685bb83ecc4f794a878c85d011e708b9e5ac94f9827ed02065920ed80f6797683585755e18720edb0fde5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ps \
busybox-procps"

RDEPENDS:${PN} += "busybox"

inherit rpm
