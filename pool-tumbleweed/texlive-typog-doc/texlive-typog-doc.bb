SUMMARY = "Documentation for texlive-typog"
DESCRIPTION = "This package includes the documentation for texlive-typog"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn76661"

RPM_NAME = "texlive-typog-doc-2026.226.0.0.5svn76661-59.2.noarch.rpm"
RPM_HASH = "8f0dd5b86dd65bef6f5235e920afb54e441a6e906872c49d73a8fa649c3a471510dca09475ac6d4a8ede99574de15d9588c16dd051322fdb59c74401f68dfa67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-typog-grep.1 \
texlive-typog-doc"

RDEPENDS:${PN} += ""

inherit rpm
