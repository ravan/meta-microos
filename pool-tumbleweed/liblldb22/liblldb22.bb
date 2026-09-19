SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "liblldb22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "7bafc438d8966a4825abf0be7a8f6513dcc83635fb8fb75f01eb036550c7eba26e631915304b43788cccc3f0c87684631c93a8928291a549684be04cbaaf5463"

RPROVIDES:${PN} += "liblldb.so.22.1 \
liblldb22 \
liblldbIntelFeatures.so.22.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
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
