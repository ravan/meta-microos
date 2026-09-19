SUMMARY = "Find the date of last modification of a file"
DESCRIPTION = "The package fetches from the system the date of last \
modification or opening of an existing file, using the function \
\\pdffilemoddate (present in recent versions of pdfTeX); the \
user may specify how the date is to be presented."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn16189"

RPM_NAME = "texlive-getfiledate-2026.226.1.2svn16189-60.2.noarch.rpm"
RPM_HASH = "c35967d00d0e068e605dc87c02dd06600acf7845d6c54ad3d742e846f1234fc3a96312fa97a7c99468530efd6a9d40a68494cc3150713c490a49ce30217622bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getfiledate.sty \
texlive-getfiledate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-boxedminipage.sty \
tex-etextools.sty \
tex-ltxnew.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
