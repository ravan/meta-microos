SUMMARY = "Generate Unicode characters from accented glyphs"
DESCRIPTION = "The package supports XeTeX's (and other putative future similar \
engines') need for Unicode characters, in a similar way to what \
the fontenc does for 8-bit (and the like) fonts: convert \
accent-glyph sequence to a single Unicode character for output. \
The package also covers glyphs specified by packages (such as \
tipa) which define many commands for single text glyphs."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.981svn77682"

RPM_NAME = "texlive-xunicode-2026.226.0.0.981svn77682-59.4.noarch.rpm"
RPM_HASH = "bdb9d19ba22235b49e16fd9bbbfb2e94fd07a1bea4b85af67b20a452ec58f7faa9d673a1eacf580dd2b690f55670037ef551c6fdcd53588f474eb255894307ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xunicode.sty \
texlive-xunicode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-t3enc.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tipa"

inherit rpm
