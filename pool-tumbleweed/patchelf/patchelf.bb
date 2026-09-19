SUMMARY = "A utility for patching ELF binaries"
DESCRIPTION = "PatchELF is a simple utility for modifing existing ELF executables and \
libraries.  It can change the dynamic loader ('ELF interpreter') of \
executables and change the RPATH of executables and libraries."
LICENSE = "GPL-3.0-only"

PV = "0.19.1"

RPM_NAME = "patchelf-0.19.1-1.1.aarch64.rpm"
RPM_HASH = "eeb92d47377937383daa33994e25e54ace34fdaa01c3f3b6700e5aadbdbd3c4c76fbd44a0e4b2770c057c4aa90c206f6d85e7470aa64b84bb5777af6a70ae452"

RPROVIDES:${PN} += "patchelf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
