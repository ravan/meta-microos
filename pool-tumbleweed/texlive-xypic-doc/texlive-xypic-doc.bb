SUMMARY = "Documentation for texlive-xypic"
DESCRIPTION = "This package includes the documentation for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.8.9svn78101"

RPM_NAME = "texlive-xypic-doc-2026.226.3.8.9svn78101-59.4.noarch.rpm"
RPM_HASH = "d5447d6f9c1f102f3e3b054172cc2e9eef290e8915e1e87840057cc9b16f89d2371843e0fcaab4d1bf9031fa7167c8d84ef4781d9b37cecce1261b62fdb3485c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xypic-doc-en \
texlive-xypic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
