SUMMARY = "Documentation for texlive-authorarchive"
DESCRIPTION = "This package includes the documentation for texlive-authorarchive"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn77171"

RPM_NAME = "texlive-authorarchive-doc-2026.226.1.3.1svn77171-60.2.noarch.rpm"
RPM_HASH = "cd8e9a5cb62284afd09528bbb7086eea2ef410f8b197561999403eade33312ad08b7b78d90fa8a8387c5173e76a80aa6eb661a75efe7f83e8c85b36b1aeb3c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authorarchive-doc"

RDEPENDS:${PN} += ""

inherit rpm
