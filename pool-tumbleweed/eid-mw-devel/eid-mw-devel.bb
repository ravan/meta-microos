SUMMARY = "Belgium electronic identity card PKCS#11 module - development package"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains the files needed \
to develop against the eID Middleware."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.29"

RPM_NAME = "eid-mw-devel-5.1.29-1.2.aarch64.rpm"
RPM_HASH = "c5b6b9219c975b077b9653c344606fdf2c8511dd5e7b58eea586aeec96d1f7016802a4b662cfaa4961faf2d4067df3a501c1aef1938079b93a93302e00ae60e2"

RPROVIDES:${PN} += "eid-mw-devel \
pkgconfig-libbeidpkcs11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eid-mw"

inherit rpm
