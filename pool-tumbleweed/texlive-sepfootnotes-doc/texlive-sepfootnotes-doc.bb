SUMMARY = "Documentation for texlive-sepfootnotes"
DESCRIPTION = "This package includes the documentation for texlive-sepfootnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3dsvn77682"

RPM_NAME = "texlive-sepfootnotes-doc-2026.226.0.0.3dsvn77682-60.2.noarch.rpm"
RPM_HASH = "6c25f4fbc5768ede9b8d15115f2fa79872846b19877d09e6adeda9d28a90552ea6fa9022f5b24a418d20547f5fd66c8223dd9308c0c0517be4ba03dc2012706a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sepfootnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
