SUMMARY = "Docserv auxiliary service endpoints"
DESCRIPTION = "docserv-auxserver has a very efficient, small map to redirect to the correct manual page for rpm2docserv created html repositories."
LICENSE = "Apache-2.0"

PV = "20260707.78c4c29"

RPM_NAME = "docserv-auxserver-20260707.78c4c29-1.2.aarch64.rpm"
RPM_HASH = "6a7b01c86c14c060897458f27b00dd30c857f7f3669c4743a115d50fd1d2f0f5a0afce98ed36417fde454a34d2aef8a1579c5605adecd01c1aaca93a9efcc610"

RPROVIDES:${PN} += "docserv-auxserver \
group-docserv-aux \
user-docserv-aux"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
sysuser-shadow"

inherit rpm
