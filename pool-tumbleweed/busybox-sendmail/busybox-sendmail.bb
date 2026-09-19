SUMMARY = "Busybox applets replacing sendmail"
DESCRIPTION = "This package contains the symlinks to replace sendmail with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-sendmail-1.38.0-42.2.noarch.rpm"
RPM_HASH = "511bead383a96f8949f842b2975ab00f7086bf4483209e3d7ec7f58ef7c15f69af3d8a28ba416159d08725dd05bc44585a19639b88cdb7f5b62cec5182e71dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sendmail \
smtp-daemon"

RDEPENDS:${PN} += "busybox"

inherit rpm
