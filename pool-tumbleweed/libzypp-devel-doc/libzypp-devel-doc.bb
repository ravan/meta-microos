SUMMARY = "Developer documentation for libzypp"
DESCRIPTION = "Developer documentation for libzypp."
LICENSE = "GPL-2.0-or-later"

PV = "17.38.15"

RPM_NAME = "libzypp-devel-doc-17.38.15-1.1.aarch64.rpm"
RPM_HASH = "530a38a61f5f0d7f1e60d6728851e97700611f571bfe4edd8183221a94583211af7953d8169045516e5063f072c9579259eaf09756352b1e07b1668625508a6c"

RPROVIDES:${PN} += "libzypp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
