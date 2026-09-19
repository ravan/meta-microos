SUMMARY = "Python wrappers for systemd functionality"
DESCRIPTION = "Python module for native access to the systemd facilities. Functionality is seperated into a number of modules: \
* systemd.journal supports sending of structured messages to the journal and reading journal files, \
* systemd.daemon wraps parts of libsystemd useful for writing daemons and socket activation, \
* systemd.id128 provides functions for querying machine and boot identifiers and a lists of message identifiers provided by systemd, \
* systemd.login wraps parts of libsystemd used to query logged in users and available seats and machines."
LICENSE = "LGPL-2.1-or-later"

PV = "235"

RPM_NAME = "python313-systemd-235-4.11.aarch64.rpm"
RPM_HASH = "d6c1d60ed0087883d072a40f84884e272a84117d3acd16839c2cb4b093c80a29e179716a853ae009206cddb1228cee99bc04c28d1c7f2b3f9e48954bce1a11e3"

RPROVIDES:${PN} += "python3-systemd \
python3.13dist-systemd-python \
python313-systemd \
python3dist-systemd-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libsystemd0 \
python-abi"

inherit rpm
