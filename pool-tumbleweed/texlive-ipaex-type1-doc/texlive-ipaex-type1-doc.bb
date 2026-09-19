SUMMARY = "Documentation for texlive-ipaex-type1"
DESCRIPTION = "This package includes the documentation for texlive-ipaex-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn47700"

RPM_NAME = "texlive-ipaex-type1-doc-2026.226.0.0.5svn47700-63.2.noarch.rpm"
RPM_HASH = "bbce318e354355973b2724af7e76efe973cd3b3f98b83efc0cc882ca7aa3b4b7d2bf03a9ff772e1287ac9d1d5f2c72a02f4f5c73e69e118c589a92071a8554a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ipaex-type1-doc-ja;en \
texlive-ipaex-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
