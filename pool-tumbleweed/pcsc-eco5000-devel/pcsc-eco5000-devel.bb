SUMMARY = "PC/SC IFD Handler for the ECO 5000 Serial Smart Card Reader"
DESCRIPTION = "Driver for the ECO 5000 Serial Smart Card Reader. \
 \
 \
Authors: \
-------- \
    Frank Thater <frank@thater-online.de> \
    Andreas Schwier <andreas.schwier@cardcontact.de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "pcsc-eco5000-devel-1.2.0-91.5.aarch64.rpm"
RPM_HASH = "9fb31893a51a99f621e35cec6b06b9f60cba1fdffde1c0a2350d718ee728c1bd55b2debfbdcbc977e81eef9694cc4a50bf43a945c7134fb72cce7f3814e66865"

RPROVIDES:${PN} += "pcsc-eco5000-devel"

RDEPENDS:${PN} += "pcsc-eco5000"

inherit rpm
