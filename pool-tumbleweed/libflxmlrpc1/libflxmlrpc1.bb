SUMMARY = "An implementation of the XMLRPC protocol"
DESCRIPTION = "An implementation of the XMLRPC protocol written in C++, based upon XmlRpc++0.7 \
and modified to provide additional XMLRPC variable types. It is used in \
fldigi, flrig, flnet, flmsg, flarq, flamp, fllog, \
a suite of programs written for amateur radio emergency communications. \
Both client and server objects can be used in applications for \
peer-to-peer support."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "libflxmlrpc1-1.0.1-1.19.aarch64.rpm"
RPM_HASH = "86da87745d05e7ea8811ba34ab62cdf2e7c487786633c74731452a6750df334f02f41ef5493a73aff4b85b396ace47ecf052eaed31e9e3e46759fad2c272305e"

RPROVIDES:${PN} += "libflxmlrpc.so.1 \
libflxmlrpc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
