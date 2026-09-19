SUMMARY = "Documentation for texlive-mkjobtexmf"
DESCRIPTION = "This package includes the documentation for texlive-mkjobtexmf"
LICENSE = "Artistic-1.0"

PV = "2026.226.0.0.8svn29725"

RPM_NAME = "texlive-mkjobtexmf-doc-2026.226.0.0.8svn29725-61.2.noarch.rpm"
RPM_HASH = "d038e076f52067ba48e47588e271ddc7d19e8275ab84491fc7f84f3aa8100387940c22ce1eb9ac7ceef3abc1d8d020be412c8e5eb95eedf0cb5b4d94d05cbbe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mkjobtexmf.1 \
texlive-mkjobtexmf-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
