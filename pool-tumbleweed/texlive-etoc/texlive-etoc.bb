SUMMARY = "Completely customisable TOCs"
DESCRIPTION = "With etoc loaded, \\tableofcontents can be used multiple times, \
and an added command \\localtableofcontents allows to typeset \
'local' tables of contents, i.e. TOCs having their scope \
limited to the last sectioning command encountered. Since \
release 1.2, also \\locallistoffigures and \\locallistoftables \
are available. Loading etoc per itself does not modify the \
'contents lines' inherited from the class default or changed \
via other packages. But full usage of the package allows \
spectacular effects such as displaying TOCs as trees or mind \
maps."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn77682"

RPM_NAME = "texlive-etoc-2026.226.1.2dsvn77682-59.2.noarch.rpm"
RPM_HASH = "d11ba088cc79f566208a85bb8951e966df801aea5c2946845befc3e660f68f948c0d65893f314a4a72c63f1aaf2b07313d8d9ac2297fcd1bdd49904fc37ade1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etoc.sty \
texlive-etoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
