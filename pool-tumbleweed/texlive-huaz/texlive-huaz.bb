SUMMARY = "Automatic Hungarian definite articles and suffixes"
DESCRIPTION = "In Hungarian there are two definite articles, 'a' and 'az', \
which are determined by the pronunciation of the subsequent \
word. The definite article is 'az', if the first phoneme of the \
pronounced word is a vowel, otherwise it is 'a'. The huaz \
package helps the user to insert automatically the correct \
definite article for cross-references and other commands \
containing text. Another service offered by the package is the \
automatic suffixing of numbers and cross-references, also based \
on their pronunciation."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77576"

RPM_NAME = "texlive-huaz-2026.226.3.0svn77576-60.2.noarch.rpm"
RPM_HASH = "802131219807808129b80e90b2f5bcc3ed81ddfb0901220aa723bbec53e11cf8c385da9d6a07bc8974e2f66ed7a4f9d9fc7e9c935b319629bd985ddd8b81512a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-huaz.sty \
texlive-huaz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-refcount.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
