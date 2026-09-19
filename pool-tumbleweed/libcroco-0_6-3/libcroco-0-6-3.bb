SUMMARY = "CSS2 Parser Library"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model-like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-0_6-3-0.6.13-6.13.aarch64.rpm"
RPM_HASH = "dc6bc70c68d1d8311b5958d55e100072ec70b474e197dea28aca3a3a5b3585359148428d3bc67863baaf792e30cc530aaa2c5ab4b4ea942800a0f1e71ca0da6d"

RPROVIDES:${PN} += "libcroco-0-6-3 \
libcroco-0.6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libxml2.so.16"

inherit rpm
