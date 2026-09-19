SUMMARY = "Inline expansions within definitions"
DESCRIPTION = "The package provides a macro \\Inline that precedes a \\def or \
\\gdef. Within the definition text of an inlined definition, \
keywords such as \\Expand may be used to selectively inline \
certain expansions at definition-time. This eases the process \
of redefining macros in terms of the original definition, as \
well as definitions in which the token that must be expanded is \
deep within, where \\expandafter would be difficult and \\edef is \
not suitable. Another application is as an easier version of \
\\aftergroup, by defining a macro in terms of expanded local \
variables, then ending the group with \
\\expandafter\\endgroup\\macro."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-inlinedef-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "9a14dec38ed76de7711e783ffcd5f7a0093818a1d82a66a4cc94ee3cbc23f0b2a1ca6be67233a2517bbe28d69e36b028faf4b8e0013d5633d1ff3acf392d042e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinedef.sty \
texlive-inlinedef"

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
