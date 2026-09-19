SUMMARY = "Binary files of exceltex"
DESCRIPTION = "Binary files of exceltex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn25860"

RPM_NAME = "texlive-exceltex-bin-2026.20260301.svn25860-120.4.aarch64.rpm"
RPM_HASH = "dbbb0f8eb4c6062b4de42bca1a9cc2e025abd1d20097a4404c1cd2a902ab68f2550d5b0e22162175267e9ab31a1537aa40963e3d4d07d47502a311332d695168"

RPROVIDES:${PN} += "texlive-exceltex-bin"

RDEPENDS:${PN} += "texlive-exceltex"

inherit rpm
