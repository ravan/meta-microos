SUMMARY = "Binary files of biber"
DESCRIPTION = "Binary files of biber"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn75738"

RPM_NAME = "texlive-biber-bin-2026.20260301.svn75738-120.4.noarch.rpm"
RPM_HASH = "297706b4bf9043fa12feca74aeafa3b60ee89fef204ea14484be17b717a9b4e25bbec18648879158a02a1bbab15490e97627747307d0a4c26bc3c653464e90c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-bin"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Biber \
perl-LWP--UserAgent \
perl-Text--BibTeX \
perl-Text--Roman \
texlive-biber"

inherit rpm
