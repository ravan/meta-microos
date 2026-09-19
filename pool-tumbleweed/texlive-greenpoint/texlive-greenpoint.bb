SUMMARY = "The Green Point logo"
DESCRIPTION = "A Metafont-implementation of the logo commonly known as 'Der \
Grune Punkt' ('The Green Point'). In Austria, it can be found \
on nearly every bottle. It should not be confused with the \
'Recycle'-logo, implemented by Ian Green."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-greenpoint-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "8bae300f420c8f7391a71fa65e216a9fb0ed947aeb5028c990eae95f59d8cbf8893320b9a6aba29de3cabde73898571847f21a906cca5672da34b5a3f42253b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greenpoint.tfm \
texlive-greenpoint"

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
