SUMMARY = "A Stroke Translation Library"
DESCRIPTION = "LibStroke is a stroke interface library.  Strokes are motions of the \
mouse that can be interpreted by a program as a command.  Strokes are \
used extensively in CAD programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libstroke0-0.5.1-236.9.aarch64.rpm"
RPM_HASH = "fdcb70a2e5cf205d663dc812bfbd397413c2534436ed81953cbdd5c4f6f4807474dea7d8374693ed0a49150f4621a908247fee42a86ceee6cc9d8a245a31d90d"

RPROVIDES:${PN} += "libstroke \
libstroke.so.0 \
libstroke0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
