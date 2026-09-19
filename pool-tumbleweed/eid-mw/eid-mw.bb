SUMMARY = "Belgium electronic identity card PKCS#11 module and Firefox plugin"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains a few helper \
programs needed by the eID Middleware and the infrastructure for eid-mw."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.29"

RPM_NAME = "eid-mw-5.1.29-1.2.aarch64.rpm"
RPM_HASH = "68737be472c8b011e9b83c35cae30ca87204cd12251b145fabecb9fca002229103c6e469320f4624b10a2c70a786d70778ab7312ff6bc7eed44a383f383a8328"

RPROVIDES:${PN} += "eid-mw"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pcsc-ccid"

inherit rpm
