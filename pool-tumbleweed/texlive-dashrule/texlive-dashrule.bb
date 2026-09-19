SUMMARY = "Draw dashed rules"
DESCRIPTION = "The dashrule package makes it easy to draw a huge variety of \
dashed rules (i.e., lines) in LaTeX. dashrule provides a \
command, \\hdashrule, which is a cross between LaTeX's \\rule and \
PostScript's setdash command. \\hdashrule draws horizontally \
dashed rules using the same syntax as \\rule, but with an \
additional, setdash-like parameter that specifies the pattern \
of dash segments and the space between those segments. Because \
dashrule's rules are constructed internally using \\rule (as \
opposed to, e.g., PostScript \\specials) they are fully \
compatible with every LaTeX back-end processor."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-dashrule-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "96ab78bb8aa1ee0b635788fa444fe079a0ad93d94ac2072276d80f2a512e8b414c91722b0a0884de199850c790615719763bef8a9a456941d7b3d817873a0b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashrule.sty \
texlive-dashrule"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
