SUMMARY = "Babel support for Irish"
DESCRIPTION = "The package provides the language definition file for support \
of Irish Gaelic in babel. The principal content is translations \
to Irish of standard 'LaTeX names'. (No shortcuts are defined.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0hsvn77682"

RPM_NAME = "texlive-babel-irish-2026.226.1.0hsvn77682-60.2.noarch.rpm"
RPM_HASH = "52f22c633b4c9e3d448e64295c8f8218042d3c6a94750c6f58ee7041b1b8cf2434ed7ec6ec4e778ba92505b85a56407300a491720c53eabb2d0544377a2511ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-irish.ldf \
texlive-babel-irish"

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
