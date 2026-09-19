SUMMARY = "Documentation for texlive-texdoc"
DESCRIPTION = "This package includes the documentation for texlive-texdoc"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.4.1.1svn73876"

RPM_NAME = "texlive-texdoc-doc-2026.227.4.1.1svn73876-62.2.noarch.rpm"
RPM_HASH = "2e320f6d1de30c5c2e919d2f39f09efe5b60f9cae9bf53c99954d3804b6df4823d9f5e08adb9260907a7fa794e626921c548d1244e3af962807d0b4067f854ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdoc.1 \
texlive-texdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
