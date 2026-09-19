SUMMARY = "Hooks for standard TeX token lists"
DESCRIPTION = "The package takes control of the six TeX token registers \
\\everypar, \\everymath, \\everydisplay, \\everyhbox, \\everyvbox \
and \\everycr. Real hooks for each of the registers may be \
installed using a stack like interface. For backwards \
compatibility, each of the \\everyX token lists can be set \
without interfering with the hooks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn35675"

RPM_NAME = "texlive-everyhook-2026.226.1.2svn35675-59.2.noarch.rpm"
RPM_HASH = "2e4dcf6db664ff709f52b644c13b83dbe0214725ce7a93979c53352575b8aa38d2cd424dcfa795395993220fb23ddd4a1d8e5f340f38cf05181af3a098ce1449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everyhook.sty \
texlive-everyhook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
