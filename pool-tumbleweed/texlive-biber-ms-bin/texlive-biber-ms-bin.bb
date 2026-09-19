SUMMARY = "Binary files of biber-ms"
DESCRIPTION = "Binary files of biber-ms"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn66478"

RPM_NAME = "texlive-biber-ms-bin-2026.20260301.svn66478-120.4.noarch.rpm"
RPM_HASH = "346b061998629c69a3fe31dda8233281822398c6e559b9b4b35da15b1edbe630a924acd5530f9842c6cb8040619bf35dbf4814afeb43847fe6f78d83a7b6cca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms-bin"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Biber \
perl-LWP--UserAgent \
perl-Text--BibTeX \
perl-Text--Roman \
texlive-biber-ms"

inherit rpm
