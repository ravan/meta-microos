SUMMARY = "Binary files of texblend"
DESCRIPTION = "Binary files of texblend"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn68961"

RPM_NAME = "texlive-texblend-bin-2026.20260301.svn68961-120.4.aarch64.rpm"
RPM_HASH = "a501f37d9442fe74eec5ce1503f36cf3c56e095a0c2cc69d621e8439949070096836f9e4f99f2b865a850e3b3b8701b482a5d14bc479bce969d1368e90351b69"

RPROVIDES:${PN} += "texlive-texblend-bin"

RDEPENDS:${PN} += "texlive-texblend"

inherit rpm
