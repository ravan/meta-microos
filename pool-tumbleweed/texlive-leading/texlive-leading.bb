SUMMARY = "Define leading with a length"
DESCRIPTION = "The package defines a command \\leading, whose argument is a \
<length> that specifies the nominal distance between \
consecutive baselines of typeset text. The command replaces the \
rather more difficult LaTeX command \\linespread{<ratio>}, where \
the leading is specified by reference to the font size."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-leading-2026.226.0.0.3svn77682-61.2.noarch.rpm"
RPM_HASH = "7e4216a5423b8731e9c8af0c2f0c2cfeef1083e8a79646cb140e04393bf2f705961d32a66345232c46ed076de24f360e6a2b70762b467f3a25be29aa2477bd52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leading.sty \
texlive-leading"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
