SUMMARY = "Bible references, including those to the scriptures of the Church of Jesus Christ of Latter Day Saints"
DESCRIPTION = "The package extends the bibleref-mouth package to support \
references to the scriptures of The Church of Jesus Christ of \
Latter-day Saints (LDS). The package requires bibleref-mouth to \
run, and its reference syntax is the same as that of the parent \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25526"

RPM_NAME = "texlive-bibleref-lds-2026.226.1.0svn25526-61.2.noarch.rpm"
RPM_HASH = "c7c3672ec1b79109dbc4a23c15fb7b853c7ccadf26da2567ef718771a421ec0a393244c36f93d65a73a6328e2a72aac1f0b120a3711636d55468f6c2157a0eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-lds.sty \
texlive-bibleref-lds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref-mouth.sty \
tex-hyperref.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
