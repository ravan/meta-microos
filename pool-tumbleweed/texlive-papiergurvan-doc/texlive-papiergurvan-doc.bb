SUMMARY = "Documentation for texlive-papiergurvan"
DESCRIPTION = "This package includes the documentation for texlive-papiergurvan"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn73069"

RPM_NAME = "texlive-papiergurvan-doc-2026.226.0.0.1.0svn73069-58.2.noarch.rpm"
RPM_HASH = "4b41330f5f548b117a150375988122ca0d1814b71bafa676f4fc81bb4cdd30eed3a14765850fa81b54fd94a20330d0c0051a342dc6ec22f6315cc0adcc2da4fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-papiergurvan-doc-fr \
texlive-papiergurvan-doc"

RDEPENDS:${PN} += ""

inherit rpm
