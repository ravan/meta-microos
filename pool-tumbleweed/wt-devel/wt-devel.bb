SUMMARY = "Web Toolkit - Development Files"
DESCRIPTION = "Development files for the Wt library. \
 \
Wt is a C++ library and application server for developping and \
deploying web applications. The widget-centric API is inspired by \
existing C++ GUI APIs. It offers complete abstraction of any \
web-specific implementation details.  Most imporantly, the entire \
application is written in only one compiled language (C++), from which \
the library generates the necessary HTML, Javascript, CGI, and AJAX \
code."
LICENSE = "GPL-2.0-only"

PV = "4.12.6"

RPM_NAME = "wt-devel-4.12.6-1.4.aarch64.rpm"
RPM_HASH = "9ae9694950c1ea86122bfe8380c0b64bc7b72ddba26b74531ac2c47dd021bb02b359416b20358fe42f7d569ddb766b04654f51204f883664668ee1ee3c84c38a"

RPROVIDES:${PN} += "cmake-wt \
wt-devel"

RDEPENDS:${PN} += "FastCGI-devel \
Xerces-c-devel \
boost-devel \
cmake \
mxml-devel \
pkgconfig-openssl \
wt \
wt-dbo \
wt-dbo-mysql \
wt-dbo-postgres"

inherit rpm
