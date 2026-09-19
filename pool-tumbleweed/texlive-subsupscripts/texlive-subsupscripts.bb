SUMMARY = "A range of sub- and superscript commands"
DESCRIPTION = "The package provides a comprehensive and flexible set of \
commands for combinations of left and right sub- and \
superscripts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn16080"

RPM_NAME = "texlive-subsupscripts-2026.226.1.0svn16080-64.2.noarch.rpm"
RPM_HASH = "bd7607c9bb0d4abd72d94029df3a50460bedd8e15f531929d10db60153be3da6069f2799408f32ae9ae689e15d0177abfbd182f1cd5a5ab8ab388721aa5e231f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subsupscripts.sty \
texlive-subsupscripts"

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
