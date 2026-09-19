SUMMARY = "Give notes a unique front page for every chapter and section"
DESCRIPTION = "This package can help you format your notes easily and give \
them a unique front page for every chapter and section. It \
calculates your progress and then displays the progress bar \
under the title. It also displays a partial table of contents \
under every progress bar and only shows the subdirectories of \
the current part. To generate this, you can simply enter your \
current completed titles with a command that accepts Variable \
Arguments. Still, that also helps you review your notes. You \
can also customise the colour of the bar."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67054"

RPM_NAME = "texlive-unifront-2026.226.1.0svn67054-60.2.noarch.rpm"
RPM_HASH = "d67d21294e83fec80210a07dbe75fef10cada776a995044cc505288076c271fcf208b755587d8c05d412064df39885233d2036a3351ba93a37a5e68470146d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unifront.sty \
texlive-unifront"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
