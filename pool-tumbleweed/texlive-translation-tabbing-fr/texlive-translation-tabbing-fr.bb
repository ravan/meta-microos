SUMMARY = "French translation of the documentation of Tabbing"
DESCRIPTION = "A translation to French (by the author) of the documentation of \
the Tabbing package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24228"

RPM_NAME = "texlive-translation-tabbing-fr-2026.226.svn24228-59.2.noarch.rpm"
RPM_HASH = "84ca87915c7ae0ae415e3873749f2defd4da4a8732685741c982664028a79148a12e1b15b192cc227db16e0558f96c02859cf7b45c7551565e5644dac4695365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-tabbing-fr"

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
