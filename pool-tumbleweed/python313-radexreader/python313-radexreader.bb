SUMMARY = "Reader for the RADEX RD1212 and ONE Geiger counters"
DESCRIPTION = "The RadexReader is an user-space driver for the RADEX RD1212 and \
the RADEX ONE Geiger counters. It allow to read and clear stored \
data via USB. \
 \
To avoid Access denied (insufficient permissions), don't forget \
to unplug the device after installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "python313-radexreader-1.3.0-1.5.noarch.rpm"
RPM_HASH = "034ce2aa3e05ba364ddbb968d6edbb5131559680cf503cd9104754c6aec19804e08b984ef6a7517050df30efb1680ba8b9988ae3aa91dc1e101ebd24b21d1b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-radexreader \
python3.13dist-radexreader \
python313-radexreader \
python3dist-radexreader"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-pyserial \
python313-pyusb \
update-alternatives"

inherit rpm
