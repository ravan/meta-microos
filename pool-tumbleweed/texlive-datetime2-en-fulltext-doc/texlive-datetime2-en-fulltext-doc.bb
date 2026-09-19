SUMMARY = "Documentation for texlive-datetime2-en-fulltext"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-en-fulltext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36705"

RPM_NAME = "texlive-datetime2-en-fulltext-doc-2026.226.1.0svn36705-59.2.noarch.rpm"
RPM_HASH = "2bac217a4f5d2d653b82285112b8a10d2670bfbcdecbb41bf0f220ae821010e2486eb098ac04fb64e7862281c5ef0ebe075a5127a904298cc64715de7c315a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-en-fulltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
