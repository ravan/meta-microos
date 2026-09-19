SUMMARY = "HPLIP basic utilities"
DESCRIPTION = "The Hewlett-Packard Linux Imaging and Printing project (HPLIP) provides \
support for HP printers, scanners, and all-in-one devices. \
 \
This package contains basic command line utilities for probing HP printers \
and all-in-one devices, and for installing the proprietary HP plugin. \
 \
For setting up new devices, install hplip-driver-* or hp-ppds-* packages."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-base-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "cc51274f5e9ace1d5627ff0804443ce2a0810de57e27cf211a03033dd1f3b1b8396f79b8e6fb48d248acddb3ebc5e27976fb52a878e7800fb8b09e2840e549e1"

RPROVIDES:${PN} += "hplip-base"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
hplip-cups \
hplip-sane \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libhpdiscovery.so.0 \
libhpipp.so.0 \
libhpmud.so.0 \
python-abi \
sane-backends \
wget"

inherit rpm
