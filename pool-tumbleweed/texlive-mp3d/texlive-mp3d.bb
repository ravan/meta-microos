SUMMARY = "3D animations"
DESCRIPTION = "Create animations of 3-dimensional objects (such as polyhedra) \
in MetaPost."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn29349"

RPM_NAME = "texlive-mp3d-2026.226.1.34svn29349-61.2.noarch.rpm"
RPM_HASH = "3ff8e15ccbaea10a95464f31c9d95b63becd45b81834f0ae64ac0e87b190acc60d5b1a3eed91f6b2179e29e98a5267c983c6636cf7994989a05334cc286b4607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mp3d"

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
