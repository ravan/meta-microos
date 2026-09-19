SUMMARY = "Reference items in a theorem environment"
DESCRIPTION = "The package provides the means to directly reference items of \
lists nested in theorem-like environments (e.g., as 'Theorem 1 \
a'). The package extends the ntheorem and cleveref packages. \
The package also provides other theorem markup commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn29062"

RPM_NAME = "texlive-coolthms-2026.226.1.2svn29062-61.2.noarch.rpm"
RPM_HASH = "960c03ca191330ea3ce3c5878c039a5a6971950de353c95de1b940b5a96c355c6014b63dbf4bf6c41ee4110de6bb31b7c7bae586780afbf194ce33d7a7f4adf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolthms.sty \
texlive-coolthms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-cleveref.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-letltxmacro.sty \
tex-ntheorem.sty \
tex-scrbase.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
