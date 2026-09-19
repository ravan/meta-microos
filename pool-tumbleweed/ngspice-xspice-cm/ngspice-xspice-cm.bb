SUMMARY = "Xspice code model Plugins"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the Xspice code model plugins."
LICENSE = "BSD-2-Clause"

PV = "46"

RPM_NAME = "ngspice-xspice-cm-46-1.2.aarch64.rpm"
RPM_HASH = "e6eef928a167bdc286cf1dec4bcc239d7875bc38addf4235e1b52b96db6e30a2470cb80296fed841b51a61a66525ed9ede23453e2d9dc6d296c41bf49b0c600e"

RPROVIDES:${PN} += "ngspice-xspice-cm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
