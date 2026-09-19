SUMMARY = "Change section levels easily"
DESCRIPTION = "Allows you to write '\\Level 2 {Some heading}' instead of the \
usual \\section stuff; the definitions of the levels can then \
easily be changed. There is a mechanism for shifting all \
levels. This makes it easy to bundle existing articles into a \
compilation."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.94svn21095"

RPM_NAME = "texlive-outliner-2026.226.0.0.94svn21095-61.2.noarch.rpm"
RPM_HASH = "20891dd824c4b6c7371aad9df6d2cb971ef6b1cf66265246fe37396c9c9602b188d72959fe7fd21778eb973553c5d26713dabe7dc0439412634f42bcc10cbf6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outliner.sty \
texlive-outliner"

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
