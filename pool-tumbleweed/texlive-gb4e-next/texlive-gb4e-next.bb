SUMMARY = "Linguistic tools"
DESCRIPTION = "The package provides gb4e users two relative example reference \
commands. \\Next refers to the next example in the document and \
\\Prev refers to the previous example. No explicit label command \
is required."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn72692"

RPM_NAME = "texlive-gb4e-next-2026.226.0.0.5svn72692-60.2.noarch.rpm"
RPM_HASH = "2ee6872b84fd530f02fc767033a68080ebb3ade82d560710736320b659984c81fc295b4e8dc4c826fb6f5dfb11c8770ace6a46339022037de7b2c6971b04b85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gb4e-next.sty \
texlive-gb4e-next"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-gb4e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
