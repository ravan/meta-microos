SUMMARY = "Binary files of cjk-gs-integrate"
DESCRIPTION = "Binary files of cjk-gs-integrate"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn37223"

RPM_NAME = "texlive-cjk-gs-integrate-bin-2026.20260301.svn37223-120.4.aarch64.rpm"
RPM_HASH = "c56e9cd35b59be04db700572ef2d687ddec24052010e2d4663fa5b0694571ad8e9713159a40f46623f9a5a4fda354a57254633d61e0035221c1fed59f2b4e13f"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-bin"

RDEPENDS:${PN} += "texlive-cjk-gs-integrate"

inherit rpm
