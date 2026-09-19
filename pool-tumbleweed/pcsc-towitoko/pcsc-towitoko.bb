SUMMARY = "PCSC driver for Towitoko Smart Card Readers"
DESCRIPTION = "This package contains a driver for Towitoko Chipdrive Micro, Extern, \
Extern II, Intern, and Twin and Kartenzwerg smart card readers. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package. \
 \
Please note, that many modern Towitoko readers are supported by the \
openct package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8"

RPM_NAME = "pcsc-towitoko-2.0.8-2.5.aarch64.rpm"
RPM_HASH = "49284f444b9de518edb6d54dd2d7812584313f4194dcddc8398f109931edc5d2338bfd61520e2e380fea5f8858079272a1dc2bdbddf0a8c696d253a97b2d49ba"

RPROVIDES:${PN} += "pcsc-towitoko"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtowitoko.so.2 \
pcsc-lite"

inherit rpm
