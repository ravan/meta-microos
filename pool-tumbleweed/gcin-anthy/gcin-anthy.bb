SUMMARY = "Gcin anthy module"
DESCRIPTION = "gcin anthy module, try this to input Japanese with libanthy"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-anthy-2.9.0-7.9.aarch64.rpm"
RPM_HASH = "d7c1c4b1795ed74b0a60cac54c51ef9dde800890942cb2ac94512357855fc38844fa751321ba2d53a700aadbef6b3f059c6352ebe6256356aa80fedf802e58f3"

RPROVIDES:${PN} += "gcin-anthy \
gcin-anthy-module"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcin \
libanthy.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
