SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.1.0"

RPM_NAME = "babeltrace2-devel-2.1.0-2.7.aarch64.rpm"
RPM_HASH = "5ec0af06dbeae1869e701c780c5dbd3d967241117400730e9f8325fa82091caf3745221f9c3af2a550d6df14849cd1fef9ab87c7073ab90e7dbee8f3a3afd658"

RPROVIDES:${PN} += "babeltrace2-devel \
pkgconfig-babeltrace2 \
pkgconfig-babeltrace2-ctf-writer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
babeltrace2"

inherit rpm
