SUMMARY = "Perl script to print DVI meta information"
DESCRIPTION = "The package provides a perl script which prints information \
about a DVI file. It also supports XeTeX XDV format."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn59216"

RPM_NAME = "texlive-dviinfox-2026.226.1.06svn59216-61.4.noarch.rpm"
RPM_HASH = "966f6ce26fc8244c98b7256e6c4d9ff84a9cea01d346f52f7734ee4f8ee0f33846ae4ce58a1951c5ab50ca6dddb2d4d129fa911a20e4b30c4894f63863b13e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
texlive \
texlive-dviinfox-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
