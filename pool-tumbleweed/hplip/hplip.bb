SUMMARY = "HP's Printing, Scanning, and Faxing Software"
DESCRIPTION = "The Hewlett-Packard Linux Imaging and Printing project (HPLIP) provides \
support for HP printers, scanners, and all-in-one devices. \
 \
This is a meta package that pulls in the entire HPLIP software suite."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "f47b0eb71ffc5ec8e189221b8f0b3e934bb4d084a27dc404e6ef183d05052d4998a08fba9438c6126ae3c058a1b2279f7781de1d776b949f15a4e061ded928af"

RPROVIDES:${PN} += "hplip"

RDEPENDS:${PN} += "hplip-ppds-fax \
hplip-ppds-hpps \
hplip-ppds-postscript \
hplip-utils"

inherit rpm
