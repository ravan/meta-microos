SUMMARY = "The new \\makecommand command always (re)defines a command"
DESCRIPTION = "The package provides a \\makecommand command, which is like \
\\(re)newcommand except it always (re)defines a command. There \
is also \\makeenvironment and \\provideenvironment for \
environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-makecmds-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "d3c0337d42489ca42163076c18779646665caa1e1679a04cf29d577da6b946afc2a5da2a92b32275aff8a79a94f2cd700e39d3eafe377a5adc1f53d82e3e2f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makecmds.sty \
texlive-makecmds"

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
