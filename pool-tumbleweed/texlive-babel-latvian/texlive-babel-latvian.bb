SUMMARY = "Babel support for Latvian"
DESCRIPTION = "The package provides the language definition file for support \
of Latvian in babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0csvn71108"

RPM_NAME = "texlive-babel-latvian-2026.226.2.0csvn71108-60.2.noarch.rpm"
RPM_HASH = "12019677769a102bdb61b5fc9190e2e155d85468c1578e906041c6883426a73d7ece35e56e43dcf70e036471e758d9cd90473da6f7d62a78e4a20d70ea7156ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latvian.ldf \
texlive-babel-latvian"

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
