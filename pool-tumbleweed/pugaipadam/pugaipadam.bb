SUMMARY = "An elegant image viewer for cosmic"
DESCRIPTION = "An elegant image viewer for cosmic."
LICENSE = "GPL-3.0-only"

PV = "0+20250902.9645085"

RPM_NAME = "pugaipadam-0+20250902.9645085-1.6.aarch64.rpm"
RPM_HASH = "707cc368e55ee4774605357006184a4d0374c04ee28fbfe86bb336a8aced0609650e8eef671aaaa9000f7dc71c21e52b14000a021ffd1b5aa7caeb2268af7459"

RPROVIDES:${PN} += "pugaipadam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
