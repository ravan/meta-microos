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

RPM_NAME = "pcsc-towitoko-devel-2.0.8-2.5.aarch64.rpm"
RPM_HASH = "80689ae697fb6df446d6a2c9dfd24364fb5b27f265fad5e230f1a4a4107a99a4ef1005f817a420f1bc3df0d908ae7f9de17e8b3829d2238579dcb6249261a0de"

RPROVIDES:${PN} += "pcsc-towitoko-devel"

RDEPENDS:${PN} += "libtowitoko2"

inherit rpm
