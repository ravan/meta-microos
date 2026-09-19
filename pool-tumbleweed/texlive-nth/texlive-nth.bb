SUMMARY = "Generate English ordinal numbers"
DESCRIPTION = "The command \\nth{<number>} generates English ordinal numbers of \
the form 1st, 2nd, 3rd, 4th, etc. LaTeX package options may \
specify that the ordinal mark be superscripted, and that \
negative numbers may be treated; Plain TeX users have no access \
to package options, so need to redefine macros for these \
changes."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-nth-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "1a6868853344717ee5aad1b77af2ac0df8c9a7f55f791fbfdb2d06ef2f55e803f3b0d1e89ee61b90d86c4fba1ddfcce359e1e5563300868c6963dc2041ae9cf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nth.sty \
texlive-nth"

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
