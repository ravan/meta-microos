SUMMARY = "Python3 module for ZBar"
DESCRIPTION = "This package contains the module to use ZBar from python3."
LICENSE = "LGPL-2.1-or-later"

PV = "0.23.93"

RPM_NAME = "python3-zbar-0.23.93-4.3.aarch64.rpm"
RPM_HASH = "9528b58d273c3778b452d75763c46abfeaadfa10fbde905529e7250bfee7139dab0c335d7054ad2891df383d62662821d9e3babb9a9dd7a9b629ad35911081c5"

RPROVIDES:${PN} += "python3-zbar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzbar.so.0 \
python-abi"

inherit rpm
