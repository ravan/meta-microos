SUMMARY = "X FreeType library"
DESCRIPTION = "Xft is a library that connects X applications with the FreeType font \
rasterization library. Xft uses fontconfig to locate fonts so it has \
no configuration files."
LICENSE = "MIT"

PV = "2.3.9"

RPM_NAME = "libXft2-2.3.9-1.5.aarch64.rpm"
RPM_HASH = "41bf42bbf829b58c64af0b7528cda6322d66bbc43cb3ad5c6322a1c8fb57cddd95fa73b0ea575c070b62618cd11d730b0560a8fc4c2b45356d7e5b9a982743ed"

RPROVIDES:${PN} += "libXft.so.2 \
libXft2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6"

inherit rpm
