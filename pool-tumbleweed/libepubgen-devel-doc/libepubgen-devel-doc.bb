SUMMARY = "Documentation of libepubgen API"
DESCRIPTION = "The libepubgen-doc package contains documentation files for libepubgen."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-devel-doc-0.1.1-1.32.noarch.rpm"
RPM_HASH = "a6f1603d538542287c62df83a878da63db41739b9e1d9cdb7fc792c4ed6153fd783a57d635c20f11537e2b46f444e7ece0958928f36c3443a940813f874f7013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libepubgen-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
