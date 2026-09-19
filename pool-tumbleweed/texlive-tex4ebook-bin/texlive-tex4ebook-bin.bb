SUMMARY = "Binary files of tex4ebook"
DESCRIPTION = "Binary files of tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn37771"

RPM_NAME = "texlive-tex4ebook-bin-2026.20260301.svn37771-120.4.aarch64.rpm"
RPM_HASH = "23b6b1118b4c0111d01385da5bd96fef786d1569a6fb161da49a90bd67492d1e97156b57bce4e43faaa1c81bd8dcf36887021c2ac240862374626ca9b9f577a3"

RPROVIDES:${PN} += "texlive-tex4ebook-bin"

RDEPENDS:${PN} += "texlive-tex4ebook"

inherit rpm
