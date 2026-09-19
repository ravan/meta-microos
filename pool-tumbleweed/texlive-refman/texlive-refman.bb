SUMMARY = "Format technical reference manuals"
DESCRIPTION = "Document classes (report- and article-style) for writing \
technical reference manuals. It offers a wide left margin for \
notes to the reader, like some of the manuals distributed by \
Adobe."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0esvn15878"

RPM_NAME = "texlive-refman-2026.226.2.0esvn15878-60.4.noarch.rpm"
RPM_HASH = "b4bfef29ad81836da6bf9db906acca77f825e9688133ddb934863eff9dedc36162edc998e9b46cc79d2abaa740c1268fe6b5a863f0ad4d9b9bb7d385e5526ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagepc.sty \
tex-refart.cls \
tex-refrep.cls \
texlive-refman"

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
