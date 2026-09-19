SUMMARY = "German variants of standard BibTeX styles"
DESCRIPTION = "A development of the (old) german.sty, this bundle provides \
German packages, BibTeX styles and documentary examples, for \
writing documents with bibliographies. The author has since \
developed the babelbib bundle, which (he asserts) supersedes \
germbib."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-germbib-2026.226.svn76790-60.2.noarch.rpm"
RPM_HASH = "3120dc61d7aaf5c22f7c2bf451a61517d31435816273ae5f4c534271cbb827856ce225556cfe5c99172423906584d3db64bd9d9de1ae3487d42b53c3dc872cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibgerm.sty \
tex-mynormal.sty \
texlive-germbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-german.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
