SUMMARY = "Headers and sources for development with CLHEP GenericFunctions library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP GenericFunctions library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-GenericFunctions-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "7f4fe67726dbd39a4b9ae996e1b7c795ba7e138094b1c536db7ff920418e16023e26691f4a8aad62dfd1b02c92fcbb6063b01885342bebbc7679aebfab526f84"

RPROVIDES:${PN} += "clhep-GenericFunctions-devel \
pkgconfig-clhep-genericfunctions"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libCLHEP-GenericFunctions-2-4-7-2"

inherit rpm
