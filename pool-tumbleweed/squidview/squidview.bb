SUMMARY = "Interactive console program which monitors squid logs access"
DESCRIPTION = "Squidview is an interactive console program which monitors \
and displays squid logs in a nice fashion, and may then go \
deeper with searching and reporting functions. \
 \
If you don't know what squid is or does this program is probably not for you. \
 \
To use squidview you must at least have read access to squid's \
access.log file. You may need to see your administrator for this. \
Squidview uses this text log file for all operations. \
It does not generate its own database for tasks"
LICENSE = "GPL-2.0"

PV = "0.86"

RPM_NAME = "squidview-0.86-2.9.aarch64.rpm"
RPM_HASH = "3b34ae7ea4175c694f45231eeb3f69903e75908a91d82c8a7a3cfa67e12c3be4cf3442cc417340f85f20974ef6c4429d5cbb3532ef9a4560fa193f8a805847da"

RPROVIDES:${PN} += "squidview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
