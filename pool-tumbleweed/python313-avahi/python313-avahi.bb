SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python313-avahi-0.8-45.2.aarch64.rpm"
RPM_HASH = "3f1957fc6ef49d4d3ab0cbb2bb3bd7dc9840363f78ef643c6efd8a5c121b0b47f255a896db70734fd9cd8842e292e4fa3c79bbc4de06e5f1ab972fcb63e3722f"

RPROVIDES:${PN} += "avahi-python \
python3-avahi \
python313-avahi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
avahi \
python-abi \
python313-Twisted \
python313-dbm \
python313-dbus-python"

inherit rpm
