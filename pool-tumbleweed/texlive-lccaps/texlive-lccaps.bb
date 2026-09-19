SUMMARY = "Lowercased (spaced) small capitals"
DESCRIPTION = "This little package serves the purpose of providing a uniform \
method to use lowercased small capitals and spaced lowercased \
small capitals. It relies on the iftex, textcase, and microtype \
packages and comes with four new user macros: \\textlcc, the \
main feature: lowercased small capitals; \\spacedcaps, a prefix \
to small capitals text commands to slightly increase their \
spacing; \\textslcc and \\textssc, which are shortcuts for \
\\spacedcaps\\textlcc and \\spacedcaps\\textsc (accordingly)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn46432"

RPM_NAME = "texlive-lccaps-2026.226.1.0svn46432-61.2.noarch.rpm"
RPM_HASH = "41b9915022bc6c3ee2a11cc36e1d14127644d474e5a8592ae546c1ce5a857732d2c97f316cf836d4ed77e1faf846283bcadb2e2cdd242ae1476af7fc95e8b059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lccaps.sty \
texlive-lccaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-microtype.sty \
tex-textcase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
