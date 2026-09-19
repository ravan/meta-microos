SUMMARY = "Documentation for texlive-clrstrip"
DESCRIPTION = "This package includes the documentation for texlive-clrstrip"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-clrstrip-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "d447cbbff4f1837a9ea48a8f1275f04f5ddd7516b1b2e82d87f0b1ba9c94948719317072d2889ef280ffba9f9b40be0027e3a29264edf1f1fd55583de99b0db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrstrip-doc"

RDEPENDS:${PN} += ""

inherit rpm
