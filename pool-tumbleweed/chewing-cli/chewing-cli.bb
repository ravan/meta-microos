SUMMARY = "Chewing Command Line"
DESCRIPTION = "This package provides command-line tool for Chewing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "chewing-cli-0.12.0-1.4.aarch64.rpm"
RPM_HASH = "1621983e3395940fc6820c38e9d16263835576704fb2af46755d33821b5dd3e52d7eff7d02857e562485365812fcc6dc5c817d008c5de30b92c0190e2951835e"

RPROVIDES:${PN} += "chewing-cli"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0"

inherit rpm
