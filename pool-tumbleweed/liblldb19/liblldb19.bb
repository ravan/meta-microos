SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "liblldb19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "353e93a382f7558e891f7d6761250b960bb5bc357d3a7220e16d5b8040dd76ae3883a89ec87fba4fa6ef1466cac347c66178126065d37adea23b42d3324ace3a"

RPROVIDES:${PN} += "liblldb.so.19.1 \
liblldb19 \
liblldbIntelFeatures.so.19.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libc.so.6 \
libclang-cpp.so.19.1 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libpanel.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
