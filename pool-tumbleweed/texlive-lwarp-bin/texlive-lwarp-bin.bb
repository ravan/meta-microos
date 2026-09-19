SUMMARY = "Binary files of lwarp"
DESCRIPTION = "Binary files of lwarp"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn43292"

RPM_NAME = "texlive-lwarp-bin-2026.20260301.svn43292-120.4.aarch64.rpm"
RPM_HASH = "511acdebe6836c434f5915067ea7153f595dcb3a20f2d4ac1f3ebc92302e0ce7d288ad06b1e86987152110967717eafe700c018781e1e957b18ba3aebad1288b"

RPROVIDES:${PN} += "texlive-lwarp-bin"

RDEPENDS:${PN} += "texlive-lwarp"

inherit rpm
