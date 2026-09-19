SUMMARY = "X extension to control VNC module"
DESCRIPTION = "Xvnc extension allows X clients to read and change VNC configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "libXvnc-devel-1.16.1-3.1.aarch64.rpm"
RPM_HASH = "6a075c130279e4ca9a876dd959c65dd8ce7bc09bb376fd4395ac65d2c1fddbbef0c2fafbb59b1076b820729253ac1f34df54e299928d23277d78fc4a6ad1daef"

RPROVIDES:${PN} += "libXvnc-devel"

RDEPENDS:${PN} += "libXvnc1"

inherit rpm
