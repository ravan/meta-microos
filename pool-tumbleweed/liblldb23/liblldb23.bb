SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "liblldb23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "7193682152727ae4104f9575737186f339c19e5c73342deaa5bced9cacd342e24792ea03e8f97777d64d753c73ee7b03f482979b5e5fbce969b9d4123a0e66f6"

RPROVIDES:${PN} += "liblldb.so.23.1 \
liblldb23 \
liblldbIntelFeatures.so.23.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
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
