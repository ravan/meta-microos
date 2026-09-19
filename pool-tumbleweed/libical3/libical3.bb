SUMMARY = "An Implementation of Basic iCAL Protocols"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
calendaring and scheduling protocols (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "libical3-3.0.20-1.6.aarch64.rpm"
RPM_HASH = "24c380ce843ba50ee7817c18697631c69f0419bc87c16c75140804ffc2ed8a0b3c36494b0228d64ffb1d092f44b1dbd5beec97852a12b9efeac886baaf455263"

RPROVIDES:${PN} += "libical \
libical-cxx.so.3 \
libical.so.3 \
libical3 \
libicalss-cxx.so.3 \
libicalss.so.3 \
libicalvcal.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libstdc++.so.6"

inherit rpm
