SUMMARY = "Documentation for the libstaroffice API"
DESCRIPTION = "This package contains documentation for the libstaroffice API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-devel-doc-0.0.7-3.20.noarch.rpm"
RPM_HASH = "1861cfa2ae887130fc44b3bad9ccddad121a059776ad4e6c7bdba3c5eb186239895d0218b2a1b974c2ef3dd68fb3e5f8f67f2da0600930b6087db97f802c2d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstaroffice-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
