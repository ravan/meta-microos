SUMMARY = "Improved interface for floating objects"
DESCRIPTION = "Improves the interface for defining floating objects such as \
figures and tables. Introduces the boxed float, the ruled float \
and the plaintop float. You can define your own floats and \
improve the behaviour of the old ones. The package also \
provides the H float modifier option of the obsolete here \
package. You can select this as automatic default with \
\\floatplacement{figure}{H}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3dsvn77682"

RPM_NAME = "texlive-float-2026.226.1.3dsvn77682-60.2.noarch.rpm"
RPM_HASH = "fa1061f410f81bcd28d0e18f55ece65820188046a9cfd75eeae7c251437685f49635d550f3ca29b04ad677339db0bf7f4f6d849bdfc2307a4f97c017b746d75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-float.sty \
texlive-float"

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
