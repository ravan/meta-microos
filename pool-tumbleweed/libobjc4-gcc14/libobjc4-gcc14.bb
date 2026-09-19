SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libobjc4-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "27f16ca570232b2e169b2f239c5f69b7132474794313de06bf793b14ef34582c39e4e2867d23fb3ede9594484800567c34dae365e4302ddc47e39da2479528d0"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4 \
libobjc4-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
