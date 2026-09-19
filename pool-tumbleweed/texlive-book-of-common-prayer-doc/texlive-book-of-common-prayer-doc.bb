SUMMARY = "Documentation for texlive-book-of-common-prayer"
DESCRIPTION = "This package includes the documentation for texlive-book-of-common-prayer"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn62240"

RPM_NAME = "texlive-book-of-common-prayer-doc-2026.226.1.1.0svn62240-59.2.noarch.rpm"
RPM_HASH = "45e349a0d38a347501c8bb13fa452e0bca11d0b28f0cb86d74c0a5f29002d0041377d53c7092e9ca57a01f1a7e92ed964482565f58242de3b59f6b98ff8d50c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-book-of-common-prayer-doc"

RDEPENDS:${PN} += ""

inherit rpm
