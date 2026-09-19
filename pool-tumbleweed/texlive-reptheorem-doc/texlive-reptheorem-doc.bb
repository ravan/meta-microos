SUMMARY = "Documentation for texlive-reptheorem"
DESCRIPTION = "This package includes the documentation for texlive-reptheorem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.1svn76224"

RPM_NAME = "texlive-reptheorem-doc-2026.226.1.4.1svn76224-60.4.noarch.rpm"
RPM_HASH = "d38b2d6060837466dde654f4704cb71907e7397844cef81e92130782d977ef616e9383232e8123ca292c1375039fef5410ac9faffa972748a4a51ab544dc94ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reptheorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
