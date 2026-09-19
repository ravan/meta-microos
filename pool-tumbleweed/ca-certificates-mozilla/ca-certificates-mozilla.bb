SUMMARY = "CA certificates for OpenSSL"
DESCRIPTION = "This package contains some CA root certificates for OpenSSL extracted \
from MozillaFirefox"
LICENSE = "MPL-2.0"

PV = "2.84"

RPM_NAME = "ca-certificates-mozilla-2.84-1.3.noarch.rpm"
RPM_HASH = "28918e55cb8b9238e5017bcd50ac5ef783273e754543f9af4f492e482b3428b6fa1b61de6210d62fce8c8c845ddc1ef925180c0755cff70c1da462068649a1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-mozilla"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates"

inherit rpm
