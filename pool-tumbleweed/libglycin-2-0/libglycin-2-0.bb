SUMMARY = "Shared library for libglycin"
DESCRIPTION = "Sandboxed and extendable image decoding. \
 \
This package provides the shared library for libglycin"
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "2.1.5"

RPM_NAME = "libglycin-2-0-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "c9163a1da90240bbcfe4402b7fca3bb5f7d3ef94ff0f96e673c6dd28b87056de76642713f6b5697f3a0c724c71b7423595a289357d55cbb9f33bf7a0dc0f384f"

RPROVIDES:${PN} += "libglycin-2-0 \
libglycin-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblcms2.so.2 \
libseccomp.so.2"

inherit rpm
