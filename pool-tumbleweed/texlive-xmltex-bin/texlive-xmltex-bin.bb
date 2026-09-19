SUMMARY = "Binary files of xmltex"
DESCRIPTION = "Binary files of xmltex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn3006"

RPM_NAME = "texlive-xmltex-bin-2026.20260301.svn3006-120.4.aarch64.rpm"
RPM_HASH = "622ffa8f872a6a103ce49e7fa659c3fc8b39b78953e5e44e3f34d18e2b6dbc838cbd3f78372ca4f62d44fa5a5cde62d26f1ab8f96cbe8977f23b3551eddd4809"

RPROVIDES:${PN} += "texlive-xmltex-bin"

RDEPENDS:${PN} += "texlive-xmltex"

inherit rpm
