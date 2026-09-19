SUMMARY = "Enhanced support for linguistics"
DESCRIPTION = "This is an experimental bundle of packages that provide \
enhanced support for typesetting in linguistics. It can be used \
as a single package, or the packages can be loaded \
independently for separate features. Currently, it provides the \
following packages: LinguisTiX-base: A base package used by \
other LinguisTiX siblings LinguisTiX-fixpex: Solves the \
compatibility bug between expex and unicode-math \
LinguisTiX-fonts: General text in the New Computer Modern font \
family LinguisTiX-ipa: IPA text in the New Computer Modern font \
family LinguisTiX-glossing: Accessible interlinear glossing \
LinguisTiX-leipzig: Leipzig-style glossing with tagging \
LinguisTiX-languages: Support for modern multilingual \
typesetting LinguisTiX-logos: For printing the logos of the \
LinguisTiX bundle LinguisTiX-nfss: Extra control over NFSS"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.8svn77571"

RPM_NAME = "texlive-linguistix-2026.226.0.0.8svn77571-61.2.noarch.rpm"
RPM_HASH = "b48b50111fdc264b97634e4ea78043d116355c2aa4bdab5181c271b1644ede32c094e524c6284e778997c717f5aef37c02eae76659e1ad8702f462fdc65ce34a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linguistix-american.sty \
tex-linguistix-base.sty \
tex-linguistix-british.sty \
tex-linguistix-english.sty \
tex-linguistix-fixpex.sty \
tex-linguistix-fonts.sty \
tex-linguistix-glossing.sty \
tex-linguistix-greek.sty \
tex-linguistix-ipa.sty \
tex-linguistix-languages.sty \
tex-linguistix-leipzig.sty \
tex-linguistix-logos.sty \
tex-linguistix-marathi.sty \
tex-linguistix-nfss.sty \
tex-linguistix.sty \
texlive-linguistix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontspec.sty \
tex-lua-unicode-math.sty \
tex-multicol.sty \
tex-setspace.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
