SUMMARY = "Support for spell-checking of LuaTeX documents"
DESCRIPTION = "The package aids spell-checking of TeX documents compiled with \
the LuaTeX engine. It can give visual feedback in PDF output \
similar to WYSIWYG word processors. The package relies on an \
external spell-checker application to check spelling of a text \
file and to output a list of bad spellings. The package should \
work with most spell-checkers, even dumb, TeX-unaware ones."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.41svn73571"

RPM_NAME = "texlive-spelling-2026.226.0.0.41svn73571-64.2.noarch.rpm"
RPM_HASH = "cad02a455f2fe51827873d4df26b45a658e2544512b6cfe599e46a457a49a8b96288b3fe2fa0e272c6e822085a7dede5a09971e98f9fd016966bc56d07b6a698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spelling.sty \
texlive-spelling"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifluatex.sty \
tex-luatexbase-attr.sty \
tex-luatexbase-mcb.sty \
tex-luatexbase-modutils.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
