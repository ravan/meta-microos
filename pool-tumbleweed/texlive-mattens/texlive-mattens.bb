SUMMARY = "Matrices/tensor typesetting"
DESCRIPTION = "The mattens package contains the definitions to typeset \
matrices, vectors and tensors as used in the engineering \
community for the representation of common vectors and tensors \
such as forces, velocities, moments of inertia, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3bsvn77682"

RPM_NAME = "texlive-mattens-2026.226.1.3bsvn77682-59.2.noarch.rpm"
RPM_HASH = "57d5587e3c8412752b3e200892200b8af1e7f1069aa5b7f57f9a60d0867e94afc6f640389b04d3d121224bee003067b4a9c55475ee124df8ce7ae74c843b0edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mattens.sty \
texlive-mattens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
