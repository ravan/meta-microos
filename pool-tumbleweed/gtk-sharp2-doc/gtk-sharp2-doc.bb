SUMMARY = "Monodoc documentation for gtk-sharp2"
DESCRIPTION = "This package contains the gtk-sharp2 documentation for monodoc."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-doc-2.12.45-6.3.aarch64.rpm"
RPM_HASH = "180e21dbf3254bb72eeaf410e66c962f2b8d95a1953d9fa85914013b2d6ca3e6002f6adbc9b2e4aa373762cea4da6ac8ce8c5d133214ccb8a2ad6eac1cb415c8"

RPROVIDES:${PN} += "gtk-sharp2-doc"

RDEPENDS:${PN} += ""

inherit rpm
