SUMMARY = "Change kerning for German quotation marks"
DESCRIPTION = "The package germcorr has to be loaded after the package german. \
It brings some letters like T nearer to german single and \
double quotes even when that letter wears a standard accent \
like '`\\.T''."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-germkorr-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "578407392b4da97377a8af7c24d58814e7436aaf3d93c823f6bce499b8c074cae63ccbed8289b76ccea1cc19cd65145b2970bbe95576c133f3ce2f65ebb23503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-germkorr.sty \
texlive-germkorr"

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
