SUMMARY = "Derivation trees with MetaPost"
DESCRIPTION = "A set of MetaPost macros for typesetting derivation trees (such \
as used in sequent calculus, type inference, programming \
language semantics...). No MetaPost knowledge is needed to use \
these macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.97svn29349"

RPM_NAME = "texlive-drv-2026.226.0.0.97svn29349-59.2.noarch.rpm"
RPM_HASH = "0008d7adbd58cce2c86261d6b6e22b96a002cd46ea615f69e86af52fc54bd1dbe92091d848946a1159491ef84aa0fe891f93bb72ba3f19a4ff4dd1c781781c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drv"

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
