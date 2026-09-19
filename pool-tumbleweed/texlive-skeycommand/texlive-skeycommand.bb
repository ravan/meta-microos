SUMMARY = "Create commands using parameters and keyval in parallel"
DESCRIPTION = "The package provides tools for defining LaTeX commands and \
environments using combinations of parameters and keys. All the \
facilities of the ltxkeys and skeyval packages are available to \
the user of skeycommand."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn24652"

RPM_NAME = "texlive-skeycommand-2026.226.0.0.4svn24652-64.2.noarch.rpm"
RPM_HASH = "0f93265293895caf571005d28694f7bc993de4c10a91735e7913dcf00449179d7c082ead901077b9daf94865228eb01fa198360f0d89d578ac61f314718c51ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skeycommand.sty \
texlive-skeycommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
