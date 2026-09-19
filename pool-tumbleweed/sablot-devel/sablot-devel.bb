SUMMARY = "Header Files and Libraries for Sablot Development"
DESCRIPTION = "Header files and libraries needed for sablot development."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "sablot-devel-1.0.3-132.1.aarch64.rpm"
RPM_HASH = "f350458b3dcc5bb84a125a426e791433dda399b336d53018267e0b5519b14abf8780950d6c9f2884a3b11fa73313a151a71778460d5e35abda1498e3a60e5857"

RPROVIDES:${PN} += "sablot-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
sablot"

inherit rpm
