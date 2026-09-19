SUMMARY = "Babel support for Portuges"
DESCRIPTION = "The package provides the language definition file for support \
of Portuguese and Brazilian Portuguese in babel. Some shortcuts \
are defined, as well as translations to Portuguese of standard \
'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2usvn77682"

RPM_NAME = "texlive-babel-portuges-2026.226.1.2usvn77682-60.2.noarch.rpm"
RPM_HASH = "e00e4f7ae145d543f608e48462c114e1a31c4e6aa3885b0956bdc0d461875f97001ae00bb2f1425e7b16cc79650d49d29f3e8953f6b58c2c6532fca0f9f8aae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brazil.ldf \
tex-brazilian.ldf \
tex-portuges.ldf \
tex-portuguese.ldf \
texlive-babel-portuges"

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
