SUMMARY = "GObject Introspection Tools"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.86.0"

RPM_NAME = "gobject-introspection-1.86.0-3.4.aarch64.rpm"
RPM_HASH = "5ceb549aca7beb029ae210cd9269d962c31e124d18450238d1e23f0bc88667e4cb973bc13517722d284f11e40c3777f373dc08328eef4ace5e45938c33d83470"

RPROVIDES:${PN} += "gobject-introspection"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
file \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgio-2.0.so.0 \
libgirepository-1-0-1 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
pcre2-tools \
python-abi \
python3-setuptools \
python3-xml"

inherit rpm
