SUMMARY = "Library for PCSC driver for Towitoko Smart Card Readers"
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

RPM_NAME = "libtowitoko2-2.0.8-2.5.aarch64.rpm"
RPM_HASH = "f9978c131df31e809a453fde70e3262a31b506f7c0dc5a6ddf4238aebb04401c0ced31f7a849bd269d44e71dc8aefcb6ddfd3b9e8acf6f96d380cd4350ccc983"

RPROVIDES:${PN} += "libtowitoko.so.2 \
libtowitoko2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
