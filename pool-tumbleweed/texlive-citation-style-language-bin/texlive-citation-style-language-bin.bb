SUMMARY = "Binary files of citation-style-language"
DESCRIPTION = "Binary files of citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn64151"

RPM_NAME = "texlive-citation-style-language-bin-2026.20260301.svn64151-120.4.aarch64.rpm"
RPM_HASH = "b40fcbc882b4a8ab37f5ee6cd10d673d02c759b26880282f4b3f79a988b6098991909cd623c615ef2194b1bf3c9020f930035b67bc17da4e2ee946263769d863"

RPROVIDES:${PN} += "texlive-citation-style-language-bin"

RDEPENDS:${PN} += "texlive-citation-style-language"

inherit rpm
