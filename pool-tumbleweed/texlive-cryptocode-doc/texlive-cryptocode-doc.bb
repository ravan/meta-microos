SUMMARY = "Documentation for texlive-cryptocode"
DESCRIPTION = "This package includes the documentation for texlive-cryptocode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.44svn60249"

RPM_NAME = "texlive-cryptocode-doc-2026.226.0.0.44svn60249-61.2.noarch.rpm"
RPM_HASH = "966a02d8a805619ca41f3eff047f7179bcb676724f40b1fc67cc44d54fcaa91177632fa377188da004500e92d1eae0f734f9243ec9e97d68c274c218a573168d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cryptocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
