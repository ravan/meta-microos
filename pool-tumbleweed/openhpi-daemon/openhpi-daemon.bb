SUMMARY = "Implementation of SA Forum's Hardware Platform Interface (HPI)"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-daemon-3.8.0.ge4631e8a-3.20.aarch64.rpm"
RPM_HASH = "25cdda4decbf8a429a057c48160ba87b24b6f19cef90e701b2c9f317f6b6b2a35c0ccba0dac1a937fa3a4c290b300b6b29c85a2c39dbf74e1c998c901319ea0a"

RPROVIDES:${PN} += "openhpi-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libopenhpi-ssl.so.4 \
libopenhpimarshal.so.4 \
libopenhpitransport.so.4 \
libopenhpiutils.so.4 \
libstdc++.so.6 \
openhpi \
systemd"

inherit rpm
