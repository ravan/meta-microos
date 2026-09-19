SUMMARY = "Use bold small caps and typewriter fonts"
DESCRIPTION = "Allows access to 'extra' bold fonts for Computer Modern OT1 \
encoding (the fonts are available in Metafont source). Since \
there is more than one bold tt-family font set, the version \
required is selected by a package option."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-bold-extra-2026.226.0.0.1svn78101-59.2.noarch.rpm"
RPM_HASH = "46986c8445ddb7418e002c5339e1cb6deb6d956b28b8d40e3dce5b466a63d9855d7d729c2e72c18c75db8d7d07ab456680d68a61205ac0e109779e372c300e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bold-extra.sty \
texlive-bold-extra"

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
