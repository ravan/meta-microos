SUMMARY = "Mock hardware devices for creating unit tests and bug reporting"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. It also provides tools to record the properties \
and behaviour of particular devices, and to run a program or test suite under a \
test bed with the previously recorded devices loaded."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19.7"

RPM_NAME = "umockdev-0.19.7-1.4.aarch64.rpm"
RPM_HASH = "b68376eeef983383271187cfae378e36acf521217fd8094976802ea179338d6e770e481fa2486405a9b2830cdeb2724a4ef449a3332814295ca3091e1c57da1e"

RPROVIDES:${PN} += "umockdev"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcap.so.1 \
libselinux.so.1 \
libumockdev.so.0"

inherit rpm
