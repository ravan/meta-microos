SUMMARY = "OpenPACE Documentation"
DESCRIPTION = "This package contains the OpenPACE documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "openpace-doc-1.1.3-1.9.noarch.rpm"
RPM_HASH = "0ee990cd1ec5ffc0eb1f563d398a8c051d859694a41696daea89d3c706d845750fc3200a12f2c84da52841e785bf8c28bebbe623313ddcf30e2e6538708a96ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openpace-doc"

RDEPENDS:${PN} += ""

inherit rpm
