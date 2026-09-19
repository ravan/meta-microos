SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python314-avahi-0.8-45.2.aarch64.rpm"
RPM_HASH = "b3828a00172c5b265427333e0350abeba151d24b6349d80a709e4d60ec6cf009ec7b4c69634de3081d6d4143cb2527d0501170af30d81bea69b0b32d04c05d09"

RPROVIDES:${PN} += "python314-avahi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
avahi \
python-abi \
python314-Twisted \
python314-dbm \
python314-dbus-python"

inherit rpm
