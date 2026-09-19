SUMMARY = "Client library for interacting with the Zeitgeist daemon"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon. \
 \
This package provides the client library for Zeitgeist."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "libzeitgeist-2_0-0-1.0.4-1.9.aarch64.rpm"
RPM_HASH = "94acd7e4a5e86f08429d87d2710f3ef95adc993aa48b2161b0eccce230c2511f84ed0e5833be0c4f8a190266b98e51a51df3bc09d2f780a797fb333edf4b04fa"

RPROVIDES:${PN} += "libzeitgeist-2-0-0 \
libzeitgeist-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
