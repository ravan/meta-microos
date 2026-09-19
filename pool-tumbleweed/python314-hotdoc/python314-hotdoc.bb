SUMMARY = "A documentation tool micro-framework"
DESCRIPTION = "Hotdoc is a documentation framework. It provides an interface for extensions \
to plug upon, along with some base objects (formatters, ...) \
 \
Hotdoc is distributed with a set of extensions that perform various tasks, \
such as parsing C and extracting symbols with clang, parsing \
gobject-introspection (gir) files, highlighting the syntax of code snippets \
with prism, etc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.4"

RPM_NAME = "python314-hotdoc-0.17.4-3.9.aarch64.rpm"
RPM_HASH = "431417c93b7b0974c289b7b60d20042269846372edfd82627b321b4a16ffb32d2515d26a852cbaae7405f7acce3f8f5b1a0b59ff0c85fb75d4a439623c6d0858"

RPROVIDES:${PN} += "python3.14dist-hotdoc \
python314-hotdoc \
python3dist-hotdoc"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
clang-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libjson-glib-1.0.so.0 \
libxml2.so.16 \
llvm-devel \
python-abi \
python314-PyYAML \
python314-appdirs \
python314-backports.entry-points-selectable \
python314-dbus-deviation \
python314-faust-cchardet \
python314-lxml \
python314-networkx \
python314-pkgconfig \
python314-schema \
python314-toposort \
python314-wheezy.template \
update-alternatives"

inherit rpm
