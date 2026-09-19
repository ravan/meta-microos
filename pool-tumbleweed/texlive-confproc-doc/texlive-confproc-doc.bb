SUMMARY = "Documentation for texlive-confproc"
DESCRIPTION = "This package includes the documentation for texlive-confproc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn29349"

RPM_NAME = "texlive-confproc-doc-2026.226.0.0.8svn29349-61.2.noarch.rpm"
RPM_HASH = "a1c51345abb0bb822702aebeae857aa0cff053faea872af8dec51376b4ebb1b6f488c840fa8276ef26338672426c77cdaa17fdd823a638773046f6c6f431f569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-confproc-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
