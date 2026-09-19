SUMMARY = "Conversion Utility"
DESCRIPTION = "The 'units' program converts quantities expressed in various scales to \
their equivalents in other scales. \
 \
Units can also convert temperature values (Fahrenheit to Celsius, for \
example) but this needs a slightly different input syntax. See the man \
page for details."
LICENSE = "GPL-3.0-or-later"

PV = "2.27"

RPM_NAME = "units-2.27-1.4.aarch64.rpm"
RPM_HASH = "27a8a07c13c5646e7cb783806d6e976030f29722c41a4bb6a362cf1e1648cc01b13da308e62b44ef98a8c4ab78bb69029a4e57c9f193db699686a7a7fc22bd76"

RPROVIDES:${PN} += "units"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
python3-requests"

inherit rpm
