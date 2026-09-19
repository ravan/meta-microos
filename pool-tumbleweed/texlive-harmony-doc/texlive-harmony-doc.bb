SUMMARY = "Documentation for texlive-harmony"
DESCRIPTION = "This package includes the documentation for texlive-harmony"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72045"

RPM_NAME = "texlive-harmony-doc-2026.226.svn72045-60.4.noarch.rpm"
RPM_HASH = "424d0126b4b989fabf799ac5cb8deb52e0e0f3e25e0880e19bcad058da15d3f50cd0ae50473bec2332aacd132cc978942e795f0c70061912e9b1269acbc9602b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harmony-doc"

RDEPENDS:${PN} += ""

inherit rpm
