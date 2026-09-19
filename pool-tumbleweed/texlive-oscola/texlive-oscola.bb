SUMMARY = "BibLaTeX style for the Oxford Standard for the Citation of Legal Authorities"
DESCRIPTION = "The package provides a set of style files for use with BibLaTeX \
(v 2+) and Biber (v 1+) to produce citations and bibliographies \
in accordance with the widely-used Oxford Standard for the \
Citation of Legal Authorities. It also includes facilities for \
constructing tables of cases and legislation from citations (in \
conjunction with appropriate indexing packages)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77682"

RPM_NAME = "texlive-oscola-2026.226.1.7svn77682-61.2.noarch.rpm"
RPM_HASH = "46114218dc5ea76926210ffadbdf5a7555ee5f9231ce26dba83100a20cbcb412ffdb98df7152005747c35fab792b77b0853476b0701b6ad9fbe49be0460e4266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-oscola.lbx \
tex-british-oscola.lbx \
tex-english-oscola.lbx \
tex-oscola.bbx \
tex-oscola.cbx \
texlive-oscola"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle.bbx \
tex-verbose-inote.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
