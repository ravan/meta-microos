SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS gateway client library."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "librgw-devel-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "01da35033c07ee539a4fb0ced787b8699ca855d22fb2fc6ca455d91955c15111a0d4d90bfb81a8b3465c11f7dd2df1a621de48595ddf657c02488c1172c28264"

RPROVIDES:${PN} += "librgw-devel \
librgw2-devel"

RDEPENDS:${PN} += "librados-devel \
librgw2"

inherit rpm
