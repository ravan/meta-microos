SUMMARY = "XKB event daemon"
DESCRIPTION = "The xkbevd event daemon listens for specified XKB events and executes \
requested commands if they occur. The configuration file consists of \
a list of event specification/action pairs and/or variable definitions."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "xkbevd-1.1.6-1.8.aarch64.rpm"
RPM_HASH = "d296b55b253960ab6c5a4dd40a396d11995a41bc9347630785f6c377a95287db98968efa2d295a7a3f94c720b1057a94ba2959d3e39bae56ac480b6a74133203"

RPROVIDES:${PN} += "xkbevd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
