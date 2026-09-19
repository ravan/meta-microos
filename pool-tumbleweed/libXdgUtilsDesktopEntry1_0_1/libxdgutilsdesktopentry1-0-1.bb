SUMMARY = "Shared library for xdg-utils-cxx"
DESCRIPTION = "Implementation of the FreeDesktop specifications to be used in c++ projects. \
Shared library for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXdgUtilsDesktopEntry1_0_1-1.0.1-2.5.aarch64.rpm"
RPM_HASH = "185a9c60df8275efea36b27022ba79920da361afee7004bfc0e1140e4411d45ba92858f53e8fe1580256fb78a693a42a9a065e32f0f7a3cbdc7edd9013ebdb34"

RPROVIDES:${PN} += "libXdgUtilsDesktopEntry.so.1.0.1 \
libXdgUtilsDesktopEntry1-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
