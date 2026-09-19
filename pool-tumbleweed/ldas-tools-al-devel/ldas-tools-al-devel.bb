SUMMARY = "Headers and source files for developing with ldas-tools-al"
DESCRIPTION = "This package provides the headers and sources needed for developing programs using ldas-tools-al - LDAS tools abstraction toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "ldas-tools-al-devel-2.6.7-1.9.aarch64.rpm"
RPM_HASH = "2e402de3c9f98b75121794499656f3d19b1ef55e29dc4b5e7d9017da35098035f4baa0f255b5fab3529f2e3161fdb5730e6d771d4a7f28fb3c83149b0b2dc0e1"

RPROVIDES:${PN} += "ldas-tools-al-devel \
pkgconfig-ldastoolsal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldastoolsal7"

inherit rpm
