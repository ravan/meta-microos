SUMMARY = "Enhanced index typesetting"
DESCRIPTION = "This package provides some enhanced features for typesetting \
indexes, notably: (1) Continuation text when entries or \
sub-entries continue from one page or column to the next. (2) \
An interface for accessing marks created from index entries, so \
that (for example) a running head can include the range of \
index entries that appears on the page."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21.6svn76924"

RPM_NAME = "texlive-indextra-2026.226.0.0.21.6svn76924-60.2.noarch.rpm"
RPM_HASH = "70c2152f0ddccee5744fab915937c214806d16328a9769f0bb2781d297721edab6a77242bd65a02e61d450a818ba5e33d3e1e55270245c60d87dc853b42d1d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-indextra.sty \
texlive-indextra"

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
