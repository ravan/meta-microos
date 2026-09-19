SUMMARY = "Client package for the Hylafax server"
DESCRIPTION = "This is client part of the Hylafax fax server. If the Hylafax fax \
server is already running on another machine, this package can be \
used to access the server."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "hylafax+-client-7.0.11-2.4.aarch64.rpm"
RPM_HASH = "7b173d6d979860157e7b99b36673d0219e3dbf57d1a897dd7fec973af0e9c4193753123b172222665bde74cd5c9d4ded87f3a074f3d3918019d11e2d35c42de8"

RPROVIDES:${PN} += "config-hylafax+-client \
hylafax+-client \
hylafax-client"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfaxutil.so.7.0.11 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
