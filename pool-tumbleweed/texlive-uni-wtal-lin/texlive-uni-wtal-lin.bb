SUMMARY = "Citation style for linguistic studies at the University of Wuppertal"
DESCRIPTION = "The package defines a BibLaTeX citation style based on the \
standard author-year style. The citations are optimised for \
linguistic studies at the Institute of Linguistics at the \
Bergische Universitat Wuppertal."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn31409"

RPM_NAME = "texlive-uni-wtal-lin-2026.226.0.0.2svn31409-60.2.noarch.rpm"
RPM_HASH = "bb88bd5c79af3cdb2feb9bfad45344da6aa43c1f5fda711a272f653463171717b838d869dfd14fab616dc2204bef5ca52755ada355f076c6b5a22761b01ead78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni-wtal-lin.bbx \
tex-uni-wtal-lin.cbx \
texlive-uni-wtal-lin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-authoryear.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
