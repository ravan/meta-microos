SUMMARY = "BGI-compatible 2D graphics C library"
DESCRIPTION = "libXbgi is a Borland Graphics Interface (BGI) emulation library for \
X11. This library strictly emulates most BGI functions, making it \
possible to compile X11 versions of programs written for \
Turbo/Borland C. RGB extensions and basic mouse support are also \
implemented."
LICENSE = "MIT"

PV = "365"

RPM_NAME = "libXbgi1-365-4.5.aarch64.rpm"
RPM_HASH = "bc2ec8eb53c42ac46e60626441e1ef97d704f3cd19050364d2852f17b58e35784d2a74d8050c109bd108eef489aab107e72273fd9a2b377651c24aa3ae61c767"

RPROVIDES:${PN} += "libXbgi.so.1 \
libXbgi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
