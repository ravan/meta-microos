SUMMARY = "Documentation for texlive-ndsu-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ndsu-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46639"

RPM_NAME = "texlive-ndsu-thesis-doc-2026.226.svn46639-61.2.noarch.rpm"
RPM_HASH = "f61a44de33e63f3557a1f5aecf28a5eebf5479229a33d98efbfbf1f5506510f6fe6b45494b5a82f3f03b84b70d4da147c781ea1d2be25c90b93d7512ee8af257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ndsu-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
