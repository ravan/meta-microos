SUMMARY = "Shared libraries for Vinyl Cache"
DESCRIPTION = "Vinyl Cache is an HTTP accelerator. Often called Reverse Proxy, it is \
an application that stores (caches) documents that have been \
requested over the HTTP protocol. \
 \
Based on certain criteria, the next client requesting the document is \
either given the cached document, or a 'fresh' document requested \
from a backend server. The purpose of this is to minimize the \
requests going to the backend server(s) by serving the same document \
to potentially many users. \
 \
This package holds the shared libraries for Vinyl Cache."
LICENSE = "BSD-2-Clause"

PV = "9.0.1"

RPM_NAME = "libvinylapi3-9.0.1-3.1.aarch64.rpm"
RPM_HASH = "6509c3b20b17b69273ce75dc3920f9908d914a5fe9b1a34c6fa89f005a4703ed3c7fec227cc3bbb15f48a1dbcea63f236261b0abf431d30fb8f6d7f7234049a3"

RPROVIDES:${PN} += "libvinylapi.so.3 \
libvinylapi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcre2-8.so.0"

inherit rpm
