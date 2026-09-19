SUMMARY = "Documentation for texlive-mp-neuralnetwork"
DESCRIPTION = "This package includes the documentation for texlive-mp-neuralnetwork"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn73627"

RPM_NAME = "texlive-mp-neuralnetwork-doc-2026.226.0.0.1svn73627-61.2.noarch.rpm"
RPM_HASH = "76532fb9cf183433d89d2db8b87d23435aa0819c0ab914ea763552e94e75a77bc5a7dad25c4623f53ba7824c1ea4a47b547595e4f5447d4d35344d584230e241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mp-neuralnetwork-doc"

RDEPENDS:${PN} += ""

inherit rpm
