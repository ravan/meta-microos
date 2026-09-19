SUMMARY = "Documentation for texlive-ascelike"
DESCRIPTION = "This package includes the documentation for texlive-ascelike"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn75662"

RPM_NAME = "texlive-ascelike-doc-2026.226.3.0svn75662-60.2.noarch.rpm"
RPM_HASH = "9478d1bf2170bd8abe0869dd0535b5a2018b494ca9e836c1fafb29dffa184be9de7e9da00c44772b5ca20f25d8cbd1f532c66e442276a645556a6514aad17176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascelike-doc"

RDEPENDS:${PN} += ""

inherit rpm
