SUMMARY = "Documentation for texlive-svninfo"
DESCRIPTION = "This package includes the documentation for texlive-svninfo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.4svn62157"

RPM_NAME = "texlive-svninfo-doc-2026.226.0.0.7.4svn62157-64.2.noarch.rpm"
RPM_HASH = "1f2747fe52031e8dfda254e7d06765a7018afedfae6cd01d97571ccde2848646daed41c01a388bf5e0cbddb728fd4cf04c80781cfa8fe1b2edaf4e249ea617db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svninfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
