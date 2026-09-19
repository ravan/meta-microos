SUMMARY = "Documentation for texlive-gatherenum"
DESCRIPTION = "This package includes the documentation for texlive-gatherenum"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.8svn76924"

RPM_NAME = "texlive-gatherenum-doc-2026.226.1.8svn76924-60.2.noarch.rpm"
RPM_HASH = "396b4d800e29a16cb1e2016e703f29e68f11fadcba646d7869e3f032109098740af66875fdcb55ccd12df85bf289961b7a849cc91f18ce888594d2167ff7dea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gatherenum-doc"

RDEPENDS:${PN} += ""

inherit rpm
