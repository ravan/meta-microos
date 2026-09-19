SUMMARY = "An Accessibility Toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices."
LICENSE = "LGPL-2.1-or-later"

PV = "2.60.6"

RPM_NAME = "libatk-1_0-0-2.60.6-1.1.aarch64.rpm"
RPM_HASH = "ed3cf5ea63386a8fd2e50de94fff13201505fdaccc4db40384d414bf7921c6d5fbd620c75d39a9c1fc54f163476781f8bda81749083ca2ea0b07b6aa7613669e"

RPROVIDES:${PN} += "atk \
libatk-1-0-0 \
libatk-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
