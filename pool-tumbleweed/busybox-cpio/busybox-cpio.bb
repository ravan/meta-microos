SUMMARY = "Busybox applets replacing cpio"
DESCRIPTION = "This package contains the symlinks to replace cpio with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-cpio-1.38.0-42.2.noarch.rpm"
RPM_HASH = "8d7c7b582fe887ab3f835c29c191d00d5e291d43de9ded3f3177068bb041357618d09dad610c5d6708b5d92c42bfca104571f93c7b8cf065fb166c0e9184e602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-cpio"

RDEPENDS:${PN} += "busybox"

inherit rpm
