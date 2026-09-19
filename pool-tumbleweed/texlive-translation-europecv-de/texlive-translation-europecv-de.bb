SUMMARY = "German version of europecv"
DESCRIPTION = "This is a 'translation' of the europecv documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23840"

RPM_NAME = "texlive-translation-europecv-de-2026.226.svn23840-59.2.noarch.rpm"
RPM_HASH = "1b9ab190bf5d2bbb9cc54cc89334c0a3043262b411eee15a609f2b87f1798e761566628f064402f45d0e60bd7ff8a3c879f972b9538292046ff0862ff9fd9091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-europecv-de"

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
