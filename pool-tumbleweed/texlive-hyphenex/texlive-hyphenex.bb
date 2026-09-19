SUMMARY = "US English hyphenation exceptions file"
DESCRIPTION = "Exceptions for American English hyphenation patterns are \
occasionally published in the TeX User Group journal TUGboat. \
This bundle provides alternative Perl and Bourne shell scripts \
to convert the source of such an article into an exceptions \
file, together with a recent copy of the article and \
machine-readable files."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn57387"

RPM_NAME = "texlive-hyphenex-2026.226.svn57387-60.2.noarch.rpm"
RPM_HASH = "91ede898d132cadc186cb1900be916f9dfed04fe33858200b40bf6a1cc6c3b835188afb264ecdbd08b08138c3cee855c2ec82f21cc949b54a1c75651580f2415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ushyphex.tex \
texlive-hyphenex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
