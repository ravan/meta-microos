SUMMARY = "Development files for libecap"
DESCRIPTION = "ecAP is a software interface that allows a network application, such as an http \
proxy or an icap server, to outsource content analysis and adaptation to a \
loadable module. the functionality is similar to the icap protocol (rfc 3507), \
but implemented as function calls instead of network interactions. \
 \
This package contains files needed to build with libecap."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "libecap-devel-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "0702cb60403659ed0c0528a1f62353372ffc645d70c338c7402318e8d1f6a579afeca7b4537e2963784405528bccab8ae95c41e6790cc1a0bef01a20ee07e747"

RPROVIDES:${PN} += "libecap-devel \
pkgconfig-libecap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libecap3"

inherit rpm
