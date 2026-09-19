SUMMARY = "SELinux Common Intermediate Language compiler"
DESCRIPTION = "The SELinux Common Intermediate Language (CIL) is designed to be a language that sits between one or more high level \
policy languages (such as the current module language) and the low-level kernel policy representation. \
 \
This is a compiler for CIL."
LICENSE = "BSD-2-Clause"

PV = "3.11"

RPM_NAME = "cil-3.11-1.2.aarch64.rpm"
RPM_HASH = "b369fd95244b67c083e9d3f997adee23a25b9ebc4db82c5efbb013524170d4d96bc5e667a19b051f195fde1e33feb8face2ee6aa82d07ebbc3463a5caeab6411"

RPROVIDES:${PN} += "cil \
cil-doc"

RDEPENDS:${PN} += "libc.so.6 \
libsepol.so.2"

inherit rpm
