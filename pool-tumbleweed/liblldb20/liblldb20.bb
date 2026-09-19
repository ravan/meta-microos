SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "liblldb20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "f30d3cb209135d4a04a9aa1155dba52c92efec2ae4835a6dc21b9c744408c6b52dca6f343b769e0d367a041b6773c26405395c921dafd994b7af52bbad829ab2"

RPROVIDES:${PN} += "liblldb.so.20.1 \
liblldb20 \
liblldbIntelFeatures.so.20.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libc.so.6 \
libclang-cpp.so.20.1 \
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
