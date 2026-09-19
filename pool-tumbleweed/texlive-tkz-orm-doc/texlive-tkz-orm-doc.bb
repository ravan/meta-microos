SUMMARY = "Documentation for texlive-tkz-orm"
DESCRIPTION = "This package includes the documentation for texlive-tkz-orm"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.4svn61719"

RPM_NAME = "texlive-tkz-orm-doc-2026.226.0.0.1.4svn61719-59.2.noarch.rpm"
RPM_HASH = "f858b5808e1b399c5d6bd1d58895b67dfc278f16e3c70a4720eed3f11343fb2dc352c395de145c57ed1ed1d8b2bf561e3f0dfc900333d1842f22b698a6773c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-orm-doc"

RDEPENDS:${PN} += ""

inherit rpm
