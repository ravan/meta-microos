SUMMARY = "Python3 bindings for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
This package contains python3 bindings for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "python3-libsoc-0.8.2-4.3.aarch64.rpm"
RPM_HASH = "4f92d5a9e691fae609ecea783a7082b7406c7bc61b139d417d0dd53a859916525042d5ce02c0f3ab60f8cc8a5c9459c95de0fc9e7d69587088bfc8582bcf2b69"

RPROVIDES:${PN} += "python3-libsoc"

RDEPENDS:${PN} += "libsoc2 \
python-abi"

inherit rpm
