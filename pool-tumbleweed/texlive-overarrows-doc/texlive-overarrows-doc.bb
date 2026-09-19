SUMMARY = "Documentation for texlive-overarrows"
DESCRIPTION = "This package includes the documentation for texlive-overarrows"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76641"

RPM_NAME = "texlive-overarrows-doc-2026.226.1.5svn76641-61.2.noarch.rpm"
RPM_HASH = "ac0bcc942f0e8a4db7ba0e5e11e3135b9da74721a0bef86e5c1113b41db4e4ccbe7f8e1c1d161abff93f644f0a0244b718a88c463fadfb8e21244e9da5f8edb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
