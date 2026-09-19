SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "liblldb21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "99a4569e0ef387ecc057d22769caeee8db65e7a916a268b402a0494effbbd15e17d43cef3b0ad84ffc7f9b9befaccb060781335d1fb1f3d8308e69b472018031"

RPROVIDES:${PN} += "liblldb.so.21.1 \
liblldb21 \
liblldbIntelFeatures.so.21.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libclang-cpp.so.21.1 \
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
