SUMMARY = "Documentation files for pdfposter"
DESCRIPTION = "HTML Documentation and examples for pdfposter."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "pdfposter-doc-0.9.1-1.2.noarch.rpm"
RPM_HASH = "f51ee8d8974343b98007457b75c91af5ebca937c4483a2604c8358e97f688eacdf3c9ccde78de6790eeee24b31f302f3a8d45fb9d98801189d61b9fdc0ab9f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
