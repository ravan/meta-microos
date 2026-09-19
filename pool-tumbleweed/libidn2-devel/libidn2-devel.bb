SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "libidn2-devel-2.3.8-1.5.aarch64.rpm"
RPM_HASH = "4f1ff633976f9779369db4c12b2cbc2011de5f0e98cd7697dce0ef43fa3f2d6e6abe0a39aa1dc000e0f8f9ffa61b9656789470caf71cf9ed3721612749f42dd4"

RPROVIDES:${PN} += "libidn2-devel \
pkgconfig-libidn2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libidn2-0"

inherit rpm
