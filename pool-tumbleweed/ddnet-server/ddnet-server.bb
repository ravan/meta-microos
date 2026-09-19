SUMMARY = "Standalone server for ddnet"
DESCRIPTION = "Standalone server for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "20.0"

RPM_NAME = "ddnet-server-20.0-1.1.aarch64.rpm"
RPM_HASH = "4d94ac55ad07e0ffa5240b8216a56f3d596ab498cdd07786b48c759ff7fd0ea80f81935396f197aca91be628bb84422bbe6d1968b5c3b4766cf223a9f9714e5d"

RPROVIDES:${PN} += "ddnet-server"

RDEPENDS:${PN} += "ddnet \
ld-linux-aarch64.so.1 \
libantibot.so \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libminiupnpc.so.21 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
