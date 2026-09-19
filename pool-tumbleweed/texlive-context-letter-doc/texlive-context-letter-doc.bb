SUMMARY = "Documentation for texlive-context-letter"
DESCRIPTION = "This package includes the documentation for texlive-context-letter"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77841"

RPM_NAME = "texlive-context-letter-doc-2026.226.svn77841-61.2.noarch.rpm"
RPM_HASH = "4fa79246c1cbb9fe7b34b0fb290d178b44213cb566c08b459fc250fc94b1fd5b954726725ad67ead514a6c6ada8ae857a6fab98310af6ff01301ca349f1ca0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-letter-doc"

RDEPENDS:${PN} += ""

inherit rpm
