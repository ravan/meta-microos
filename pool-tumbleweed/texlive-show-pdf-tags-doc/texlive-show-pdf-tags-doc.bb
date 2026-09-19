SUMMARY = "Documentation for texlive-show-pdf-tags"
DESCRIPTION = "This package includes the documentation for texlive-show-pdf-tags"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77604"

RPM_NAME = "texlive-show-pdf-tags-doc-2026.226.1.5svn77604-60.2.noarch.rpm"
RPM_HASH = "a2c95ef3a2f7899e6c0984b3caa0576314207212eda1fa4a775f7126d374da7ed5c4593bfb4465dab3b24eacd4f644929f404a75eee031e46deeb0a89ef969cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-show-pdf-tags.1 \
texlive-show-pdf-tags-doc"

RDEPENDS:${PN} += ""

inherit rpm
