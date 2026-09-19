SUMMARY = "Binary files of srcredact"
DESCRIPTION = "Binary files of srcredact"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn38710"

RPM_NAME = "texlive-srcredact-bin-2026.20260301.svn38710-120.4.aarch64.rpm"
RPM_HASH = "7f1f6c6d427f60aa4c4dcb68f2594c4b7bdc5148e6d71f5bf3f5a32b84e0f83e3b03f366afd1a83eead1b06628cb2c462d499d99c7bde00eb10651a2b11833c4"

RPROVIDES:${PN} += "texlive-srcredact-bin"

RDEPENDS:${PN} += "texlive-srcredact"

inherit rpm
