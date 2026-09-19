SUMMARY = "Labels for files and folders"
DESCRIPTION = "Macros for typesetting pretty labels (optionally colored) for \
the back of files or binders (currently only the special A4 \
'Leitz-Ordner' ring binder is supported)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17272"

RPM_NAME = "texlive-flabels-2026.226.1.0svn17272-59.2.noarch.rpm"
RPM_HASH = "5c376de3959758eec6a9b9b206a6b6a3cdfcee610507c2a02b5f0321c159d37c4aad40cb0d6a4bf7012bc2c4f115597228d9207fb8b54cb0a6621189227a13a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flabels.sty \
texlive-flabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
