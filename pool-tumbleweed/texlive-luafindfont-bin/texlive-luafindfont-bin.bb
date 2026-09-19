SUMMARY = "Binary files of luafindfont"
DESCRIPTION = "Binary files of luafindfont"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn61207"

RPM_NAME = "texlive-luafindfont-bin-2026.20260301.svn61207-120.4.aarch64.rpm"
RPM_HASH = "63cd8c1a7e433bf106faf5e08fca5b05d90ee1c1892a7d9ca518baf5ea4687b9e6c436c24113870cc174d265b9f3c76bc1cacc7aab156dc82ffc84bf2f28e53b"

RPROVIDES:${PN} += "texlive-luafindfont-bin"

RDEPENDS:${PN} += "texlive-luafindfont"

inherit rpm
