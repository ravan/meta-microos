SUMMARY = "Panorama Tools Utilities"
DESCRIPTION = "Utilities for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.23"

RPM_NAME = "libpano-utils-2.9.23-1.4.aarch64.rpm"
RPM_HASH = "33cc44153c905328fcb5d6f362dead3e3a07f832b82e2c4d96750a8de3b19ca5eba7f47f6c265dd852e7b6cb85ad3759823d2913ef90de468b1b3f7eda2c6667"

RPROVIDES:${PN} += "libpano-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpano13.so.3"

inherit rpm
