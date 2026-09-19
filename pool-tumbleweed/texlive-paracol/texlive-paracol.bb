SUMMARY = "Multiple columns with texts 'in parallel'"
DESCRIPTION = "The package provides yet another multi-column typesetting \
mechanism by which you produce multi-column (e.g., bilingual) \
document switching and synchronizing each corresponding part in \
'parallel'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.37svn77682"

RPM_NAME = "texlive-paracol-2026.226.1.37svn77682-58.2.noarch.rpm"
RPM_HASH = "9f4abfce9d8be9fd11dfe74ac82ae7bd4002124efb534184baf4935e8b05f7496d91c73c1067539afe29ea3483dc1c0ad5d563d671b0a32c7595d18d20a42cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paracol-2018-12-31.sty \
tex-paracol.sty \
texlive-paracol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
