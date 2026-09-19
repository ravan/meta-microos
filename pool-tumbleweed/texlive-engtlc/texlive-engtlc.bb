SUMMARY = "Support for users in Telecommunications Engineering"
DESCRIPTION = "The package provides a wide range of abbreviations for terms \
used in Telecommunications Engineering."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn28571"

RPM_NAME = "texlive-engtlc-2026.226.3.2svn28571-61.4.noarch.rpm"
RPM_HASH = "6abd6c0ed0db436f8edbe14db118a624934bd008bfb359d3d3d0fb9a61f2536d9d277da4d72608f91caea0f7a31792404f22e016ec263cf594a377aa95078212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engtlc.sty \
texlive-engtlc"

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
