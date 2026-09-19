SUMMARY = "Documentation for texlive-outlining"
DESCRIPTION = "This package includes the documentation for texlive-outlining"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn45601"

RPM_NAME = "texlive-outlining-doc-2026.226.0.0.1svn45601-61.2.noarch.rpm"
RPM_HASH = "e4c3759bd33ce41034aeebcc68642b4ba6aac02920049cf2860ab9468e94be0f6a05051256bbef9495f40ff4ae70fb62ccd383ff93b416daeebe76bc54f06a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outlining-doc"

RDEPENDS:${PN} += ""

inherit rpm
