SUMMARY = "Binary files of match_parens"
DESCRIPTION = "Binary files of match_parens"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn23500"

RPM_NAME = "texlive-match_parens-bin-2026.20260301.svn23500-120.4.aarch64.rpm"
RPM_HASH = "453f5d22eaac8f07675f204f923d7aaaaebd731c1dd35a62f2ea82c7cccaebb612744a55e9366f6662611954ec80b4e191976d550a90bc10ca2d6028e10782cf"

RPROVIDES:${PN} += "texlive-match-parens-bin"

RDEPENDS:${PN} += "texlive-match-parens"

inherit rpm
