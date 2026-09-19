SUMMARY = "CSS2 Parser Library"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model-like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-0.6.13-6.13.aarch64.rpm"
RPM_HASH = "272b71ca967a8404218dc3945f181589180c36dd0a2a644167e1eca0cab39b8eff486f9cc9a455197aae44884015039c60d5692b924723c0d1e238dd38f8c5b4"

RPROVIDES:${PN} += "libcroco"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcroco-0.6.so.3 \
libglib-2.0.so.0 \
libxml2.so.16"

inherit rpm
