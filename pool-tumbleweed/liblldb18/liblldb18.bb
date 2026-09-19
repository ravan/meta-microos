SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "liblldb18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "72c20e8165d8b5d551accfd70c89807e391783b848cc9f082034bc5ab49a1d38a3c7d54d2101a440ce3efdaec0c1afc87063a67698ac9ebefa3bcab6381701e9"

RPROVIDES:${PN} += "liblldb.so.18.1 \
liblldb18 \
liblldbIntelFeatures.so.18.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libclang-cpp.so.18.1 \
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
