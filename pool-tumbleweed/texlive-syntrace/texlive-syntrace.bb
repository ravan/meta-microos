SUMMARY = "Labels for tracing in a syntax tree"
DESCRIPTION = "This package adds support for traces in trees created using \
either the synttree or the qtree package. The package provides \
two commands (\\traceLabel and \\traceReference) to set and use a \
trace."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-syntrace-2026.226.1.1svn15878-64.2.noarch.rpm"
RPM_HASH = "38b8bbf38b4c0a70f564ac5a41c4e272db7d6b955994695c38bddcd64c4db19570100d3f6134312067ba3351c769ac4878614586edcda3ad764f9b427de8eb0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syntrace.sty \
texlive-syntrace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-qtree.sty \
tex-synttree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
