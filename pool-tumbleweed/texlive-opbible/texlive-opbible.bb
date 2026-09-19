SUMMARY = "Creating a study Bible with OpTeX"
DESCRIPTION = "This package includes OpTeX macros which allow to create a \
study Bible in many language variants. The main Bible text is \
in separate files while the commentary apparatus can be written \
in other files. TeX is able to join all these data into a \
single print of a study Bible. Moreover, multiple language \
variants and translation subvariants are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.31svn77161"

RPM_NAME = "texlive-opbible-2026.226.0.0.31svn77161-61.2.noarch.rpm"
RPM_HASH = "96feb0a21ef63addcb9fabe913dc1ecdc6bec008092e046b60a5c73d49a1c4a59b8981ba1dd8302dd8f9a8aa5b867f39b8d1e14ddeae9dcfa02a763429d1fd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-opbible-hebrew.tex \
texlive-opbible"

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
