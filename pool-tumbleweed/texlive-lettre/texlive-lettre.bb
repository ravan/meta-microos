SUMMARY = "Letters and faxes in French"
DESCRIPTION = "Developed from the ancestor of the standard letter class, at \
the Observatoire de Geneve."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.002svn54722"

RPM_NAME = "texlive-lettre-2026.226.3.002svn54722-61.2.noarch.rpm"
RPM_HASH = "bd6a973be649deba97f3161ec8ded9f4c55c94dbf62c73842c8b314fa3960e83196510cc2b03c7741f554a40b9ee8882b992adb34a6cbe9c0f9b17de8edaaaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lettre-USenglish.ldf \
tex-lettre-amg.cfg \
tex-lettre-default.cfg \
tex-lettre-english.ldf \
tex-lettre-french.ldf \
tex-lettre-german.ldf \
tex-lettre-obs.cfg \
tex-lettre-romand.ldf \
tex-lettre.cls \
texlive-lettre"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
