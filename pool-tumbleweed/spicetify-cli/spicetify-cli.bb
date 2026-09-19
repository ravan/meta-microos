SUMMARY = "Command-line tool to customize Spotify client"
DESCRIPTION = "Command-line tool to customize the official Spotify client"
LICENSE = "LGPL-2.1-or-later"

PV = "2.45.0"

RPM_NAME = "spicetify-cli-2.45.0-1.1.aarch64.rpm"
RPM_HASH = "ac39768d125aa220b1c537274964b70012180a59f6a5a46aee9b89683a5ad13dabc0d2e81c7033f17ceae2d12cb64dc3075fb53db0dbafa74e3278fe09ba3ff4"

RPROVIDES:${PN} += "spicetify-cli"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
