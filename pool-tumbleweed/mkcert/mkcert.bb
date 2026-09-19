SUMMARY = "CLI tool for making locally-trusted development certificates"
DESCRIPTION = "mkcert is a simple tool for making locally-trusted development certificates. \
It requires no configuration. \
 \
Using certificates from real certificate authorities (CAs) for development can \
be dangerous or impossible (for hosts like example.test, localhost or \
127.0.0.1), but self-signed certificates cause trust errors. Managing your own \
CA is the best solution, but usually involves arcane commands, specialized \
knowledge and manual steps. \
 \
mkcert automatically creates and installs a local CA in the system root store, \
and generates locally-trusted certificates. mkcert does not automatically \
configure servers to use the certificates, though, that's up to you. \
 \
Warning: the rootCA-key.pem file that mkcert automatically generates gives \
complete power to intercept secure requests from your machine. Do not share it."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "mkcert-1.4.4-1.8.aarch64.rpm"
RPM_HASH = "98ffb9b5d87eab3b01285d9a24bfc5efd20311fe7882e2f3a0d4fde0edd79eb8a28c839d1bc8ea012dc7d8ec95ecef89f32b128ee36c5bb1ed9584a8aa1e0c35"

RPROVIDES:${PN} += "mkcert"

RDEPENDS:${PN} += "libc.so.6 \
mozilla-nss-tools"

inherit rpm
