SUMMARY = "The Table engine for IBus platform"
DESCRIPTION = "The package contains general Table engine for IBus platform."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.14"

RPM_NAME = "ibus-table-1.17.14-2.4.aarch64.rpm"
RPM_HASH = "0e5dfabcac9e49195ac5d05b3e7ae4a60643c1bab37cdd0334f74e0823822488dd4ceb8800be0788f17b01fd7ee22bcd3c558b9e8d6a24cadd6f372109cbea0b"

RPROVIDES:${PN} += "ibus-table"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
python3 \
python3-curses"

inherit rpm
