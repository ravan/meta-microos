SUMMARY = "Documentation for texlive-phonrule"
DESCRIPTION = "This package includes the documentation for texlive-phonrule"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn43963"

RPM_NAME = "texlive-phonrule-doc-2026.226.1.3.2svn43963-58.2.noarch.rpm"
RPM_HASH = "d1e0303f0591f9af5825a3c3098a3bce9aa173782682a2da8d602de1677dcca6d58882353addd9d5cd156cebb2f4f7795b56e3ef2244b3e1e7c4c244308c1882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phonrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
