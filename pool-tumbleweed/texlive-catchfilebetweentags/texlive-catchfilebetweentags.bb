SUMMARY = "Catch text delimited by docstrip tags"
DESCRIPTION = "This package (built using the facilities of catchfile) provides \
a macro \\catchfilebetweentags acts like the original \\catchfile \
but only extracts a portion of the file instead of the complete \
file. The extracted portion can be delimited by strings or by \
docstrip tags: %<*tag> .... %</tag> (comments in the caught \
region may be included or dropped)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn21476"

RPM_NAME = "texlive-catchfilebetweentags-2026.226.1.1svn21476-59.2.noarch.rpm"
RPM_HASH = "882e975de1e68b527689e4c0d58a376597a825e7fea23f31294c4596ffb37ab9ad674870e59000f631a3f8de0d6eb3a6d79b4f7a1b9bf7e5739f342bfcdd3f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catchfilebetweentags.sty \
texlive-catchfilebetweentags"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
