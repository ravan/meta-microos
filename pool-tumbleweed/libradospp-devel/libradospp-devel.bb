SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C++ libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "libradospp-devel-18.2.7-8.1.noarch.rpm"
RPM_HASH = "9340c83493eae5ad52d9fcf3e29552ef1dc335b29a51c606b329a0ccff0497d3590658ef5d432841ef9745eedb369f0711d9a259b5608421c2d9d03e4bf4deb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libradospp-devel"

RDEPENDS:${PN} += "librados-devel \
librados2"

inherit rpm
