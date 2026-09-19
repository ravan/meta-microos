SUMMARY = "Multiplatform helper library for other libraries"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes some \
often needed functions (for example, handling and parsing of \
configuration files, reading and writingof XML files, and interprocess \
communication)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "gwenhywfar-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "441a8be479b255ed9934df34bbb497eb9f72d8ed693fb9088fc7ed4312957b19cf5d0d39ef3dd0f35a5db3353df6e28f2db4455a95deffbb47cef58ae36d42ac"

RPROVIDES:${PN} += "gwenhywfar"

RDEPENDS:${PN} += ""

inherit rpm
