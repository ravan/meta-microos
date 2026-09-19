SUMMARY = "Documentation for the libe-book API"
DESCRIPTION = "This package contains documentation for the libe-book API."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-devel-doc-0.1.3-4.14.noarch.rpm"
RPM_HASH = "4ae2697d4522ef4114cdf743867172561393f05de729aa6c5caa746954cb27441c4aeba950ca8f291c6a21a7636e9d5c6159c5e65828e17cd909933f294b1e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libe-book-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
