SUMMARY = "Macros for mail merging"
DESCRIPTION = "This package is for use when sending a large number of letters, \
all with the same body text. The package's \\addressfile command \
is used to specify who the letter is to be sent to; the body of \
the \\mailingtext command specifies the text of the letters, \
possibly using macros defined in the \\addressfile."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0dsvn77241"

RPM_NAME = "texlive-mailing-2026.226.1.0dsvn77241-59.2.noarch.rpm"
RPM_HASH = "dcbe8264c5693e2ce514395d37113ee6d900d57325f9e90f62f70ac2a97c462a20bd137d8c6535c8fbe70e5630b072374ac1488364e0a75933cd95041c26c40c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mailing.sty \
texlive-mailing"

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
