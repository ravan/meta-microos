SUMMARY = "Documentation for gcr"
DESCRIPTION = "This packages provides the documentation for various gcr packages."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "gcr-doc-4.4.0.1-3.3.noarch.rpm"
RPM_HASH = "a268fd02ad8f5e65f9cbc5d895a24e20c7cd310ba43630c9d32e75b5e22c7e55f4bed6a2757cf6e70fd9744a1915fcced74dc8dac437165681006b6f35c23466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr-doc"

RDEPENDS:${PN} += ""

inherit rpm
