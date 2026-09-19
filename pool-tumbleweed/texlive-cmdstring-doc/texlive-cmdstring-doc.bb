SUMMARY = "Documentation for texlive-cmdstring"
DESCRIPTION = "This package includes the documentation for texlive-cmdstring"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-cmdstring-doc-2026.226.1.1svn15878-60.2.noarch.rpm"
RPM_HASH = "8a12c4e3d6800508abbe09205328e160b82fd30e825293405558b91e960a1acaf5ab684eed3c744d4664c2692057849e3d3a861f9fe130ef28a568c1e6f0ce24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmdstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
