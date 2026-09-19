SUMMARY = "A LaTeX package for typesetting integrals"
DESCRIPTION = "Typesetting integrals, although common in LaTeX, is not \
particularly practical. The way in which the different parts \
are managed often generates unreadable source code, making \
modifications laborious. The package therefore follows a simple \
philosophy: focus on the essential element of an integral, the \
integrand. Everything else (limits, differentials, symbols) can \
be modified using keys. These keys are designed to allow you to \
easily and quickly change the style of an integral. \
Additionally, the package provides various auxiliary macros to \
support some keys which can have lengthy inputs."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.1svn77252"

RPM_NAME = "texlive-intexgral-2026.226.3.0.1svn77252-60.2.noarch.rpm"
RPM_HASH = "ac93e2af8ef69345ae27ab0a1074130651cb715408688e404d6cb6a4e86350fe2ca4e6415a9af768920b586d7247c5b72a2a8930d185c985a09728625dc9be2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intexgral.sty \
texlive-intexgral"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-derivative.sty \
tex-expl3.sty \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
