SUMMARY = "Babel/Polyglossia support for Galician"
DESCRIPTION = "The package provides a language description file that enables \
support of Galician either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3csvn30270"

RPM_NAME = "texlive-babel-galician-2026.226.4.3csvn30270-60.2.noarch.rpm"
RPM_HASH = "a57e25da3574020c217f6d89bf94371f94aef08f78babc7605920b9d9b57ffde0bb2383bd7a9b8f5e79bd9e7b2a34199b98cceee6dc4aeb75b2a8ad32077cba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-galician.ldf \
texlive-babel-galician"

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
