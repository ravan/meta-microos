SUMMARY = "Change the definition of an existing command"
DESCRIPTION = "The package provides a command \\patchcommand that can be used \
to add material at the beginning and/or the end of the \
replacement text of an existing macro. It works for macros with \
any number of normal arguments, including those that were \
defined with \\DeclareRobustCommand."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn78101"

RPM_NAME = "texlive-patchcmd-2026.226.1.05svn78101-58.2.noarch.rpm"
RPM_HASH = "dfd4b0333f92df4e6997808dd8968a2b3a933caf6cab74a08fd03844906373e11fb14590f8b02ccbcac38c588b5ab33df0ab0b73d0aa33e5430a204693dc909e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-patchcmd.sty \
texlive-patchcmd"

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
