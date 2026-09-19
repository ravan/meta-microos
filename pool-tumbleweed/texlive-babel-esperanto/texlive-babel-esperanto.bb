SUMMARY = "Babel support for Esperanto"
DESCRIPTION = "The package provides the language definition file for support \
of Esperanto in babel. Some shortcuts are defined, as well as \
translations to Esperanto of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5asvn77682"

RPM_NAME = "texlive-babel-esperanto-2026.226.1.5asvn77682-60.2.noarch.rpm"
RPM_HASH = "c01e2ba348b11e3f71182ba0dd5e5e3ec953dd63d397cf9c6efe3dde76c207e478fc8fa29ede97fbe375a8e1bbb87e76326b11cd6367a4de8b730deb01acfabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esperanto.ldf \
texlive-babel-esperanto"

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
