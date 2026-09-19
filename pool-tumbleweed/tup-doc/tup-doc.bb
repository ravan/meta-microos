SUMMARY = "Documentation for tup"
DESCRIPTION = "Documents and examples for tup"
LICENSE = "GPL-2.0-only"

PV = "0.8"

RPM_NAME = "tup-doc-0.8-1.13.noarch.rpm"
RPM_HASH = "e7043805e33d7712999a32b8ea2a90f14df5c453dbb0672fdb417a294f4142c7d04a7352f284e6bafda37bd7ef2ff04cedcab4f62f70f11d99e2a153658110ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tup-doc"

RDEPENDS:${PN} += "tup"

inherit rpm
