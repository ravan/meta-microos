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

RPM_NAME = "python313-hotdoc-0.17.4-3.9.aarch64.rpm"
RPM_HASH = "4b5dd2ead2a5034a8ae9b7e5f90957ba792ea2cc5322678a6adf81b0a4601b9adddca74e35d491c0aaee3b06ef449c6f6064b45a43584b71af12174fce2defc5"

RPROVIDES:${PN} += "hotdoc \
python3-hotdoc \
python3.13dist-hotdoc \
python313-hotdoc \
python3dist-hotdoc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
clang-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libjson-glib-1.0.so.0 \
libxml2.so.16 \
llvm-devel \
python-abi \
python313-PyYAML \
python313-appdirs \
python313-backports.entry-points-selectable \
python313-dbus-deviation \
python313-faust-cchardet \
python313-lxml \
python313-networkx \
python313-pkgconfig \
python313-schema \
python313-toposort \
python313-wheezy.template \
update-alternatives"

inherit rpm
