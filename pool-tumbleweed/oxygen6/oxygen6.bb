SUMMARY = "Oxygen style, KWin decoration and cursors"
DESCRIPTION = "Provides Oxygen style, KWin decoration, and cursors."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "oxygen6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "8ff3f40a99de2b967093f44d4719a3b888e0cd81ed56633b483f3c193d35f720b1b655af9eba77ea451f7ef0798b90d13c5739f4d5e4cf9474db889ce77cb5da"

RPROVIDES:${PN} += "oxygen6"

RDEPENDS:${PN} += "oxygen6-decoration \
oxygen6-style"

inherit rpm
