SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "babeltrace-devel-1.5.8-4.9.aarch64.rpm"
RPM_HASH = "74ce5cf27dc703854cb0b51401bcb95e30b899b2724585945b5916ed5af27e6fc32cec1a5febbfa097cb6777847d6eb4ee89f143886c9af1a560204eb22d57e2"

RPROVIDES:${PN} += "babeltrace-devel \
pkgconfig-babeltrace \
pkgconfig-babeltrace-ctf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
babeltrace \
pkgconfig-babeltrace \
pkgconfig-popt \
pkgconfig-uuid"

inherit rpm
