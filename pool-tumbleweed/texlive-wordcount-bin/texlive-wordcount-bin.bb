SUMMARY = "Binary files of wordcount"
DESCRIPTION = "Binary files of wordcount"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn46165"

RPM_NAME = "texlive-wordcount-bin-2026.20260301.svn46165-120.4.aarch64.rpm"
RPM_HASH = "2166347e6c8a99bbef4053018a114523208338f96098944eaf90c07f7460c65c7d2dc61417020f0d5f5b6a5e1ba110a81a7517b61d0b74ad86b702aa6045a992"

RPROVIDES:${PN} += "texlive-wordcount-bin"

RDEPENDS:${PN} += "texlive-wordcount"

inherit rpm
