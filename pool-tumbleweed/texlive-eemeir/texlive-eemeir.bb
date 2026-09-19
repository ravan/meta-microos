SUMMARY = "Adjust the gender of words in a document"
DESCRIPTION = "Defines macros for third-person singular pronouns (\\E, \\Em, \
\\Eir, \\Eirs), which expand differently according to a \
masculine/feminine switch. (If the switch is 'masculine', they \
would expand to 'he', 'him', 'his' and 'his'; if 'feminine', \
they would expand to 'she', 'her', 'her' and 'hers'. Apart from \
the pronouns, one can define 'word pairs', such as \
mother/father, daughter/son, and so on. Gender may be defined \
once per document, as an environment, or may be flipped on the \
fly."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-2026.226.1.1bsvn15878-61.4.noarch.rpm"
RPM_HASH = "33af33e15cd9ede8c97697a1f3612e494578247a694e0ce32dfe81482783ef5a5c39055ee4dee5ff17ba7f6a9831b87792524c7d037b58a9b46882e90ece187a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eemeir.sty \
texlive-eemeir"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
