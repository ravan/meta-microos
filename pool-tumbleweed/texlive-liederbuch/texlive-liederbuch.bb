SUMMARY = "A LaTeX package for storing songs or other content, and repeated reuse in documents"
DESCRIPTION = "This package is meant for content which you reuse regularly, \
like songs in small booklets. For example the booklets used at \
church, weddings or similar events. It has two major parts: You \
typeset your content once (most likely a song), garnish it with \
some meta data and put it into a sty-file. From there you can \
insert this content into your document with one single line. \
The inserted content can have header and footer that use the \
meta data (i.e. title, composer, lyricist). Inside these \
content fragments, you can use the \\notenzeile (stave line) \
command to combine an image of a stave line with song lyrics. \
If correctly used, the lyrics are placed correctly below the \
notes and need most often no or only minor adjustments. With \
that you can combine any stave image with LaTeX fonts. You can \
find resources and inspiration in a demo project."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn76924"

RPM_NAME = "texlive-liederbuch-2026.226.1.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "71aaeaf38c7720e785eb572d1c2e2c18c0d9b0092eed20b5dac6e69a70c46638bf777432281421fba78865e17f6ccb22026b2072bebccd84daa1d30d98363ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-liederbuch-babel.sty \
tex-liederbuch-listofsongs.sty \
tex-liederbuch.sty \
tex-printliederbuch.sty \
texlive-liederbuch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-pgfmath.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
