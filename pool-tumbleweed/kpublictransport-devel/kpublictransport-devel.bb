SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries.Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpublictransport-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a6ba4fa5d2ae7a25417b7206a113e1921977c782409830ec87144c25cb19982881d7f8f3fe4ced44b22d4b821686a937a1d18915f23092c6a80ca64b95a80bc7"

RPROVIDES:${PN} += "cmake-KPublicTransport \
kpublictransport-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libKPublicTransport1 \
libKPublicTransportOnboard1 \
pkgconfig-zlib"

inherit rpm
