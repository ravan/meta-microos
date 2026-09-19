SUMMARY = "Osmocom SIMtrace host utility"
DESCRIPTION = "Osmocom SIMtrace 2 is a software and hardware system for passively \
tracing SIM-ME communication between the SIM card and the mobile phone, \
and remote SIM operation. \
 \
This package contains SIMtrace 2 host utility."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "simtrace2-0.8.0-1.19.aarch64.rpm"
RPM_HASH = "31854adfe013e81688f3b201f84f2a9a9177be7b6d33270fa8fe657c0cbfc2aa5160131e5c7afdbd7e9c7844adab5998534220d605c4304eca0f131fda3d8585"

RPROVIDES:${PN} += "simtrace2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-simtrace2.so.1 \
libosmocore.so.22 \
libosmosim.so.2 \
libosmousb.so.0 \
libusb-1.0.so.0"

inherit rpm
