SUMMARY = "Documentation for texlive-kanbun"
DESCRIPTION = "This package includes the documentation for texlive-kanbun"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-kanbun-doc-2026.226.1.3svn77682-63.2.noarch.rpm"
RPM_HASH = "d4cc2bd5a6fb3f64dc2e064b434630786c7d6587d74424b4aafd103387c915eac0ae17f814fa7e814813090bbdafe241ec649fe5051ee0d75097fc4173798131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-kanbun-doc-zh \
texlive-kanbun-doc"

RDEPENDS:${PN} += ""

inherit rpm
