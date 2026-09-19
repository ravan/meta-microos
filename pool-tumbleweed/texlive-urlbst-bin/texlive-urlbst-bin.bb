SUMMARY = "Binary files of urlbst"
DESCRIPTION = "Binary files of urlbst"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn23262"

RPM_NAME = "texlive-urlbst-bin-2026.20260301.svn23262-120.4.aarch64.rpm"
RPM_HASH = "17689d4e84916fbc23daaf26596fbaa095f88678c0be8dae612e4196a69f9da591787e866bb62c96b85169ff51d4dc83b0d59fcc6f8d4f041f502d286be7b533"

RPROVIDES:${PN} += "texlive-urlbst-bin"

RDEPENDS:${PN} += "texlive-urlbst"

inherit rpm
