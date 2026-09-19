SUMMARY = "Library for Colour ASCII Art, text mode graphics"
DESCRIPTION = "libcaca is the Colour AsCii Art library. It provides high level \
functions for colour text drawing, simple primitives for line, polygon \
and ellipse drawing, as well as powerful image to text conversion \
routines."
LICENSE = "WTFPL"

PV = "0.99.beta20+git.1776622070.7c8e333"

RPM_NAME = "libcaca0-0.99.beta20+git.1776622070.7c8e333-2.3.aarch64.rpm"
RPM_HASH = "051af20daac94222d63f7e49d12a95f1516119f6744ea7d818b07aba56ea40543c4b3ede7d2fc37b88c07de114ca30e5a1dd4474869c964691b7f1feaeafc0db"

RPROVIDES:${PN} += "libcaca \
libcaca++.so.0 \
libcaca.so.0 \
libcaca0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libslang.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
