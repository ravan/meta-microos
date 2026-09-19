SUMMARY = "Private XRootD development files"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains some private XRootD headers and development \
libraries. The use of these fikles is strongly discouraged. \
Backwards compatibility between versions is not guaranteed for \
them."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-private-devel-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "55e509643518d652aeff6ab0619f6577828e7194767e59ef83a15f14f7167da15844e0e02fad6435f00dc3de6e733efedd914e7ac1be08933367fa19f4b8d3c7"

RPROVIDES:${PN} += "xrootd-private-devel"

RDEPENDS:${PN} += "xrootd-libs \
xrootd-server-libs"

inherit rpm
