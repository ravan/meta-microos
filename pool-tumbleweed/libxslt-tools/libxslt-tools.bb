SUMMARY = "Extended Stylesheet Language (XSL) Transformation utilities"
DESCRIPTION = "This package contains xsltproc, a command line interface to the XSLT engine. \
xtend the"
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.1.45"

RPM_NAME = "libxslt-tools-1.1.45-1.4.aarch64.rpm"
RPM_HASH = "466f1c1fde463aa8e0b0760f847aa13c0b60b0dc3c787182c6798ae8bffdd36d12bbe4c5ca91e26f0c5a0a927fae49ffda79eeb1e1245a9635a223ed4b2520a5"

RPROVIDES:${PN} += "libxslt \
libxslt-tools \
xsltproc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
