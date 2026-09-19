SUMMARY = "Retrieve colour model and values for defined colours"
DESCRIPTION = "The colorinfo package"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3csvn15878"

RPM_NAME = "texlive-colorinfo-2026.226.0.0.3csvn15878-60.2.noarch.rpm"
RPM_HASH = "230d20bf562d4b1b2be912ed15a9f87353125c50d53bfe1da1a450e8e09c6bf387a71125cb9a0949dd5e18012141bc867c56484ca241b7a42ee0e40199cb828f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorinfo.sty \
texlive-colorinfo"

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
