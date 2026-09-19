SUMMARY = "Log for C++, Shibboleth Edition"
DESCRIPTION = "Log for C++ is a library of classes for flexible logging to files, syslog, \
and other destinations. It is modeled after the Log for Java library and \
stays as close to its API as is reasonable. \
 \
This package contains just the shared library."
LICENSE = "LGPL-2.1-only"

PV = "2.0.1"

RPM_NAME = "liblog4shib2-2.0.1-2.9.aarch64.rpm"
RPM_HASH = "2481743638abc11f971204af2b4673f5446ea01e3f45d7d2a7b125da6888aed4ab51530641982010c9b2fb4488ee1fa5597cb9a12efba20a22034e67e9505158"

RPROVIDES:${PN} += "liblog4shib.so.2 \
liblog4shib2 \
log4shib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
