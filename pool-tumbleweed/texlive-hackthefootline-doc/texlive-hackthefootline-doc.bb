SUMMARY = "Documentation for texlive-hackthefootline"
DESCRIPTION = "This package includes the documentation for texlive-hackthefootline"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46494"

RPM_NAME = "texlive-hackthefootline-doc-2026.226.svn46494-60.4.noarch.rpm"
RPM_HASH = "5c1072b8a969ffd5a3669b778c69343507a537b1d7bfb8a5e27d09fcd4a955945e271ee53a2f87cb4949aad6ad08e1a2639716c3d17da5e3b159d1fe7f4e7ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hackthefootline-doc"

RDEPENDS:${PN} += ""

inherit rpm
