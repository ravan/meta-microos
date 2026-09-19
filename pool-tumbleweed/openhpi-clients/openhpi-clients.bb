SUMMARY = "HPI Command-line Applications"
DESCRIPTION = "This package contains HPI command-line utilities \
 \
OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-clients-3.8.0.ge4631e8a-3.20.aarch64.rpm"
RPM_HASH = "32f5c07ad3aca6e99bc6792fef075e883fe1f3fccf5639ebeca5f031bba0fcfc5e0fe4cd2c419971e07a1e55769e73dd2c5307dfd46d8d19f7b6ec69b058e93b"

RPROVIDES:${PN} += "openhpi-clients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libopenhpi.so.4 \
libopenhpiutils.so.4 \
libstdc++.so.6 \
openhpi"

inherit rpm
