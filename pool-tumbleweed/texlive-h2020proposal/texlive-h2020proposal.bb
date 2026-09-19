SUMMARY = "LaTeX class and template for EU H2020 RIA proposal"
DESCRIPTION = "This package consists of a class file as well as FET and ICT \
proposal templates for writing EU H2020 RIA proposals and \
generating automatically the many cross-referenced tables that \
are required."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-2026.226.1.0svn38428-60.4.noarch.rpm"
RPM_HASH = "3f344603c3ce914d2a186101f06c47d33e513571db5a3b151a68fee3b60cf22eb6c5cb0cbbf3e9d53971ac6532a692e91ea2fbb6d3dab80b94b2939a8a2dcf63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-h2020proposal.cls \
texlive-h2020proposal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-colortbl.sty \
tex-coolstr.sty \
tex-longtable.sty \
tex-memoir.cls \
tex-morewrites.sty \
tex-rotating.sty \
tex-showkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
