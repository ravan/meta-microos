SUMMARY = "Binary files of cluttex"
DESCRIPTION = "Binary files of cluttex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn48871"

RPM_NAME = "texlive-cluttex-bin-2026.20260301.svn48871-120.4.aarch64.rpm"
RPM_HASH = "2549bc2344caaae298f16e6dfc7fa57861a727165af8c6170ae9a3a1975887008aa8a62c4c0fcac11098c6ff224baa44e4941609068cb500866d4d83ce6e7c8f"

RPROVIDES:${PN} += "texlive-cluttex-bin"

RDEPENDS:${PN} += "texlive-cluttex"

inherit rpm
