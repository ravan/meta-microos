SUMMARY = "Experimental hyphenation patterns for the German language"
DESCRIPTION = "The package provides experimental hyphenation patterns for the \
German language, covering both traditional and reformed \
orthography. The patterns can be used with packages Babel and \
hyphsubst from the Oberdiek bundle. Dieses Paket enthalt \
experimentelle Trennmuster fur die deutsche Sprache. Die \
Trennmuster decken das in Deutschland, Osterreich und der \
Schweiz gebrauchliche Standarddeutsch in der traditionellen und \
reformierten Rechtschreibung ab und konnen mit den Paketen \
Babel und hyphsubst aus dem Oberdiek-Bundel verwendet werden."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72949"

RPM_NAME = "texlive-dehyph-exptl-2026.226.1.0svn72949-59.2.noarch.rpm"
RPM_HASH = "32e4efd39a767db32eafe840f15c6922afee5061ff510d3af7b489d60288de1b7df3c6833b7ab7a1d83f8ef1f2f4a75b0b67af3b5026d00847c9aa49ff25c66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dehyphn-x-2024-02-28.tex \
tex-dehypht-x-2024-02-28.tex \
tex-dehyphts-x-2024-02-28.tex \
texlive-dehyph-exptl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
