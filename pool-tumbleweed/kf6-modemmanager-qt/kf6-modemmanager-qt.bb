SUMMARY = "Qt wrapper for ModemManager DBus API"
DESCRIPTION = "Qt wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-modemmanager-qt-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4f823e4675b59e55bfe5a049aad2b2e78b05239148d4d57e2acb9c9aa80f43a36088562183cc569771cfa38c72bd761e4f234943e1ecbafce4364ce83ff1befb"

RPROVIDES:${PN} += "kf6-modemmanager-qt"

RDEPENDS:${PN} += ""

inherit rpm
