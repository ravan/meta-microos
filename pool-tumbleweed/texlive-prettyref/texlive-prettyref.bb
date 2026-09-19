SUMMARY = "Make label references 'self-identify'"
DESCRIPTION = "Prettyref provides a command \\newrefformat, which specifies the \
way in which a reference is typeset, according to a label \
'identification'. The identification is set in the \\label \
command, by using prefixed label names; so instead of \
\\label{mysection}, one uses \\label{sec:mysection}, and \
prettyref interprets the 'sec:' part. The package is compatible \
with hyperref and with other packages."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-prettyref-2026.226.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "2aa11bacfd8cde9f02949a0bbf9964d25d15964b7b367da443fbf1f27b4cc616ea2dbb3b130371b33678d5d27caff7f8f781c5e522df6ef74ce994e70193de98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prettyref.sty \
texlive-prettyref"

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
