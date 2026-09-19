SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.37.13+git.1181df8"

RPM_NAME = "libOpenIPMIui1-2.0.37.13+git.1181df8-1.6.aarch64.rpm"
RPM_HASH = "7de824fcecb492552f5156e1f1affb20315f28cc8bb890a4238b2c6a500efb10003e08b93ec1e7adc31c1eb26390f84121413db7d78527095bc31c2a30be7620"

RPROVIDES:${PN} += "libOpenIPMIui.so.1 \
libOpenIPMIui1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIposix.so.0 \
libOpenIPMIutils.so.0 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
