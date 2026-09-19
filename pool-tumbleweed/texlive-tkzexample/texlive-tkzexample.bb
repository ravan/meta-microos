SUMMARY = "Package for the documentation of all tkz-* packages"
DESCRIPTION = "This package is needed to compile the documentation of all \
tkz-* packages (like tkz-euclide)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.45csvn63908"

RPM_NAME = "texlive-tkzexample-2026.226.1.45csvn63908-59.2.noarch.rpm"
RPM_HASH = "aff9ebfed289f9f42ed1f5e1e4012d5a120b85b480d34dda589da7ed11c3be4a2be2a04533bc960a2fae20ff1396b27fece29f67cf7dd1152bad5da4a5c80bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkzexample.sty \
texlive-tkzexample"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyvrb.sty \
tex-mdframed.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
