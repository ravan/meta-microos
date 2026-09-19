SUMMARY = "Development pre-release of the LaTeX amsmath bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX amsmath \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1svn77483"

RPM_NAME = "texlive-latex-amsmath-dev-2026.226.pre_release_1svn77483-63.2.noarch.rpm"
RPM_HASH = "f89b858e5858614eb1ad031ab7d394739d7abebb394a270442d18b6597375be39391f3bc992f34b08bb5e80410d1bff1559ac7e28d9f0106f41698e8f693779b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-amsbsy.sty \
texdev-amscd.sty \
texdev-amsgen.sty \
texdev-amsmath-2018-12-01.sty \
texdev-amsmath.sty \
texdev-amsopn.sty \
texdev-amstex.sty \
texdev-amstext.sty \
texdev-amsxtra.sty \
texlive-latex-amsmath-dev"

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
