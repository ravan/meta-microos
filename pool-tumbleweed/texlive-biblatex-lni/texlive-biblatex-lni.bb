SUMMARY = "LNI style for BibLaTeX"
DESCRIPTION = "BibLaTeX style for the Lecture Notes in Informatics, which is \
published by the Gesellschaft fur Informatik (GI e.V.)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn73625"

RPM_NAME = "texlive-biblatex-lni-2026.226.0.0.7svn73625-61.2.noarch.rpm"
RPM_HASH = "4251bceacbd8be70df1b5ba2253e96d46b084b38abb311ca4334d4d136687bd9e2f43fdaee06612287411bc7923b1eafd83a0d92856ee6083de2c15cf734104a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LNI-english.lbx \
tex-LNI-ngerman.lbx \
tex-LNI.bbx \
tex-LNI.cbx \
texlive-biblatex-lni"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.bbx \
tex-alphabetic.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
