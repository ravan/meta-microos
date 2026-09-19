SUMMARY = "Busybox applets replacing selinux-tools"
DESCRIPTION = "This package contains the symlinks to provide selinux-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-selinux-tools-1.38.0-42.2.noarch.rpm"
RPM_HASH = "db5f36b7a2d5b846d1555a4b4dbfcec2bbded44fcd0ac86cd7caeee370827ae808ae73f482408c2bcb3fc8851575b54980029a54a1d34dc0510d2b9f08ee0383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-selinux-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
