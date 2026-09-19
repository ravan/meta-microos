SUMMARY = "Multiple series of endnotes for critical editions"
DESCRIPTION = "Edmargin provides a very simple scheme for endnote sections for \
critical editions. Endnotes can either be marked in the text, \
or with marginal references to the page in the note sections \
where the note is to be found. Notes can be set in individual \
paragraphs, or in block paragraph mode (where there are many \
short notes). Note sections will have running headers of the \
form 'Textual notes to pp. xx--yy'. New note sections can be \
created on the fly. There are predefined endnote sections for \
textual notes, emendations, and explanatory notes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn27599"

RPM_NAME = "texlive-edmargin-2026.226.1.2svn27599-61.4.noarch.rpm"
RPM_HASH = "d2c6cb62a8c748b0c96509a4f0c2448bf67b247c08160339c723856248c01d689c55364581f38e67a25a9fb8c8b9d4b266dba5ef648bd20f50d68d3d03460365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edmargin.sty \
texlive-edmargin"

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
