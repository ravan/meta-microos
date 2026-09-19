SUMMARY = "Flxmlrpc development libraries"
DESCRIPTION = "An implementation of the XMLRPC protocol written in C++, based upon XmlRpc++0.7 \
and modified to provide additional XMLRPC variable types. It is used in \
fldigi, flrig, flnet, flmsg, flarq, flamp, fllog, \
a suite of programs written for amateur radio emergency communications."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "flxmlrpc-devel-1.0.1-1.19.aarch64.rpm"
RPM_HASH = "efbaedb1cc0b8c3267080696cec352b8f7730204c825a4a5102e85406fa89f02c4c0235fc2212dc59b4d385eeb767e67cd414071573b5f6a20d3b918bde33df2"

RPROVIDES:${PN} += "flxmlrpc-devel \
pkgconfig-flxmlrpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libflxmlrpc1"

inherit rpm
