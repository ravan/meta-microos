SUMMARY = "Python wrappers for systemd functionality"
DESCRIPTION = "Python module for native access to the systemd facilities. Functionality is seperated into a number of modules: \
* systemd.journal supports sending of structured messages to the journal and reading journal files, \
* systemd.daemon wraps parts of libsystemd useful for writing daemons and socket activation, \
* systemd.id128 provides functions for querying machine and boot identifiers and a lists of message identifiers provided by systemd, \
* systemd.login wraps parts of libsystemd used to query logged in users and available seats and machines."
LICENSE = "LGPL-2.1-or-later"

PV = "235"

RPM_NAME = "python314-systemd-235-4.11.aarch64.rpm"
RPM_HASH = "f622b748ec4f0dffd3d187191ecd1cf6a0eb1c2aa264bf411fd9b0191be95ad8d3bdfd71c5b22b210efea800f8eb9bfd3600a0065e3ff8260f2a555ab597dc52"

RPROVIDES:${PN} += "python3.14dist-systemd-python \
python314-systemd \
python3dist-systemd-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libsystemd0 \
python-abi"

inherit rpm
