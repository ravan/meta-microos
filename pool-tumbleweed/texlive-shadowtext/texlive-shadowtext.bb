SUMMARY = "Produce text with a shadow behind it"
DESCRIPTION = "The package introduces a command \\shadowtext, which adds a drop \
shadow to the text that is given as its argument. The colour \
and positioning of the shadow are customisable."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78101"

RPM_NAME = "texlive-shadowtext-2026.226.0.0.3svn78101-60.2.noarch.rpm"
RPM_HASH = "ddc90c1e5b4e2a2411cb9b0e8b62f3ccf38bd8eca94aa964dadc87dc6763775d7ba24b5aa8460602468e8eca046e9ae6cbd4def103ea182cf0d288859038a51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shadowtext.sty \
texlive-shadowtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
