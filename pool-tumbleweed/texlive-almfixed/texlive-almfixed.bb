SUMMARY = "Arabic-Latin Modern Fixed extends TeX-Gyre Latin Modern Mono 10 Regular to full Arabic Unicode support"
DESCRIPTION = "Arabic-Latin Modern Fixed is an extension of TeX-Gyre Latin \
Modern Mono 10 Regular. Every glyph and OpenType feature of the \
Latin Modern Mono has been retained, with minor improvements. \
On the other hand, we have changed the vertical metrics of the \
font. Although the Arabic script is designed to use the same \
x-size as Latin Modern Mono, the former script needs greater \
ascender and descender space. Every Arabic glyph in each \
Unicode-code block is supported (up to Unicode 7.0): Arabic, \
Arabic Supplement, Arabic Extended, Arabic Presentation-Forms \
A, and Arabic Presentation-Forms B. There are two versions of \
the font: otf and ttf. The ?penType version is for print \
applications (and usually the default for TeX). The TrueType \
version is for on-screen applications such as text editors. \
Hinting in the ttf version is much better for on-screen, at \
least on Microsoft Windows. The unique feature of Arabic-Latin \
Modern is its treatment of vowels and diacritics. Each vowel \
and diacritic (ALM Fixed contains a total of 68 such glyphs) \
may now be edited horizontally within any text editor or \
processor. The author believes this is the very first OpenType \
Arabic font ever to have this capability. Editing complex \
Arabic texts will now be much easier to input and to proofread."
LICENSE = "LPPL-1.3c"

PV = "2026.226.0.0.92svn35065"

RPM_NAME = "texlive-almfixed-2026.226.0.0.92svn35065-61.2.noarch.rpm"
RPM_HASH = "d68c944c02ece4815ebe4d4e5fbdeec11939c4a9d5920f442a1710ad5ba20f6ec4e1632590b23353ef0557e028423cdec648278d3064b6558eeca02140590308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-almfixed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-almfixed-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
