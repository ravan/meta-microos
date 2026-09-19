SUMMARY = "Srecord development files"
DESCRIPTION = "This package contains libraries and header files for compiling programs \
that manipulate EPROM load files."
LICENSE = "GPL-3.0-or-later"

PV = "1.65.0"

RPM_NAME = "srecord-devel-1.65.0-2.7.aarch64.rpm"
RPM_HASH = "d853669e533915a25aab9c2dc9b2f60a4e3352ea1dcaac5efb2f4b827ee77e1a945a0c484eb7db3e24a76581bf567724cf7e5d331f8415ef800406304088a5a9"

RPROVIDES:${PN} += "srecord-devel"

RDEPENDS:${PN} += "libsrecord0"

inherit rpm
