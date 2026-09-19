SUMMARY = "Documentation for texlive-uwa-pcf"
DESCRIPTION = "This package includes the documentation for texlive-uwa-pcf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn78219"

RPM_NAME = "texlive-uwa-pcf-doc-2026.226.1.0.1svn78219-60.2.noarch.rpm"
RPM_HASH = "4394049764c3f890906ab5226a17b9b143b27e74265f6a5ef6b0bbac7c31b6bab2026764fe69f57024e501a2a21da8fe6033baec188e31f0a780136692dba7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-pcf-doc"

RDEPENDS:${PN} += ""

inherit rpm
