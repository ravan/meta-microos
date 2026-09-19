SUMMARY = "Merge text in TeX and LaTeX"
DESCRIPTION = "Repetitively produce documents from a fixed part and a variable \
part. Such an operation is commonly used as 'mail merge' to \
produce mail shots."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.2.01svn76924"

RPM_NAME = "texlive-textmerg-2026.227.2.01svn76924-62.2.noarch.rpm"
RPM_HASH = "9750041d4462e45d97ccaf6410d443d92e87943ef0b24cd84bf8d6f997638f0f01581517d1c84cd971c1c7635a76612405d55700cf9dbbd1c411248b123710de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textmerg.sty \
texlive-textmerg"

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
