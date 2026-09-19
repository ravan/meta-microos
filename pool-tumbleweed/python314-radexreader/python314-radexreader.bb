SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "python314-radexreader-1.3.0-1.5.noarch.rpm"
RPM_HASH = "46581a5346222dfd8e4ce9469b60a2e4a81cc2f99f65d8ca783461b9dbfa4f750fb7f0d3e35c8020e43524e716a36d257be0963b28689c9feda9a6db8d3e2fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-radexreader \
python314-radexreader \
python3dist-radexreader"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-pyserial \
python314-pyusb \
update-alternatives"

inherit rpm
