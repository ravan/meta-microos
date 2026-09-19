SUMMARY = "Binary files of multibibliography"
DESCRIPTION = "Binary files of multibibliography"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn30534"

RPM_NAME = "texlive-multibibliography-bin-2026.20260301.svn30534-120.4.aarch64.rpm"
RPM_HASH = "7a815550d78b9c5b02c6dee1eae1a2ba25d9461ed3e6d79439a9346880461d8d1d04b3fde7d66894ce56c53b10df54e93ba754fde029ec8cb46d173375baa4de"

RPROVIDES:${PN} += "texlive-multibibliography-bin"

RDEPENDS:${PN} += "texlive-multibibliography"

inherit rpm
