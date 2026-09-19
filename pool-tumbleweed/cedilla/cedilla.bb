SUMMARY = "A Best-Effort Text Printer (Works in UTF-8 and Can Replace a2ps)"
DESCRIPTION = "Cedilla is a 'best-effort' text printer that uses Unicode internally. \
 \
Using Unicode means that the set of characters that can appear in the \
input is very large and the user may very well have no font available \
that contains glyphs for the characters that the user wants to print. \
Cedilla attempts to at least partially solve this problem using a \
number of techniques: \
 \
1. Cedilla can use an arbitrary number of downloadable fonts. For \
   any given print job, only the necessary fonts are downloaded. \
 \
2. Cedilla uses its own built-in font, which contains a number of \
   useful glyphs that are missing from standard fonts. \
 \
3. Cedilla modifies existing glyphs in order to, for example, remove \
   dots or add bars. \
 \
4. Cedilla attempts to build composite glyphs (for accented \
   characters, for example) on the fly. \
 \
5. Cedilla uses fallbacks for characters that are not supported by the \
   available fonts."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "cedilla-0.7-7.7.noarch.rpm"
RPM_HASH = "8fd00299fab79b6b1868cce5f577cebd74fca1513914bf9066ccf11f77fa6564dca3cc2ae362ccc6edd6315849547d7ec82076df9305bf04c6477ce039a3dd28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cedilla \
config-cedilla"

RDEPENDS:${PN} += "/usr/bin/clisp \
/usr/bin/sh \
clisp \
ghostscript-fonts-std \
texlive \
xorg-x11-fonts"

inherit rpm
