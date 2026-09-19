SUMMARY = "Documentation for texlive-cjk-ko"
DESCRIPTION = "This package includes the documentation for texlive-cjk-ko"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.5svn70300"

RPM_NAME = "texlive-cjk-ko-doc-2026.226.2.5svn70300-60.2.noarch.rpm"
RPM_HASH = "f23c72b1cad29e0492546c3f45124eddf2a39fddf671d6c3900a2c803b9c420d701b3bf4282e994b4b082c06c2fa5ca9763f3c3915979ab7179c647cc90481e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cjk-ko-doc-ko \
texlive-cjk-ko-doc"

RDEPENDS:${PN} += ""

inherit rpm
