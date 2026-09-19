SUMMARY = "Busybox applets providing syslogd"
DESCRIPTION = "This package contains the symlinks to provide syslogd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-syslogd-1.38.0-42.2.noarch.rpm"
RPM_HASH = "2c221bc60b1f489b03f77b602e1c5dcd44b2ef3282d7726513e249af2209e528ac7880fc4a303e7b446062e3de5534ca12c15a6f5caf747ca8697d88bab61e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-syslogd"

RDEPENDS:${PN} += "busybox"

inherit rpm
