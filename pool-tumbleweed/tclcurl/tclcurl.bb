SUMMARY = "Tcl Binding to libcurl"
DESCRIPTION = "TclCurl provides TCL bindings to the libcurl client-side URL transfer library."
LICENSE = "TCL"

PV = "7.22.0"

RPM_NAME = "tclcurl-7.22.0-10.10.aarch64.rpm"
RPM_HASH = "25be4f7f7b59cc96983bc15c67c35669197106b3ab13a338db35f0842e1b0cc5393e39ea276d7b3f570ca3a6376feea979967b00e0404d7422a2d611a6d1f73c"

RPROVIDES:${PN} += "libTclCurl7.22.0.so \
tclcurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
tcl"

inherit rpm
