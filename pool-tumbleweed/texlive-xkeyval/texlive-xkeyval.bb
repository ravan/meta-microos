SUMMARY = "Extension of the keyval package"
DESCRIPTION = "This package is an extension of the keyval package and offers \
additional macros for setting keys and declaring and setting \
class or package options. The package allows the programmer to \
specify a prefix to the name of the macros it defines for keys, \
and to define families of key definitions; these all help use \
in documents where several packages define their own sets of \
keys."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.10svn77682"

RPM_NAME = "texlive-xkeyval-2026.226.2.10svn77682-59.4.noarch.rpm"
RPM_HASH = "83fcfdda8ab4946a305bd50599600bc5fca0fe2d55ddceafa738be72fd96f97a6c12500961f229475c7f57aae29607c5160d364edee950d99ec25bd03cf6091d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyval.tex \
tex-pst-xkey.sty \
tex-pst-xkey.tex \
tex-xkeyval.sty \
tex-xkeyval.tex \
tex-xkvltxp.sty \
tex-xkvtxhdr.tex \
tex-xkvutils.tex \
tex-xkvview.sty \
texlive-xkeyval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
