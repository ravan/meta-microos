SUMMARY = "Documentation for texlive-byo-twemojis"
DESCRIPTION = "This package includes the documentation for texlive-byo-twemojis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn58917"

RPM_NAME = "texlive-byo-twemojis-doc-2026.226.1.0svn58917-59.2.noarch.rpm"
RPM_HASH = "63be26fe54c67400a23b07b8c1cd50772cb6d5c6883490f1e444156758b22f271f2c1fb0c632852d57ba3e013e8bfe55bacc5e4a24af3bfa427ce07620d003ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-byo-twemojis-doc"

RDEPENDS:${PN} += ""

inherit rpm
