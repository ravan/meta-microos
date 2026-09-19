SUMMARY = "Binary files of amstex"
DESCRIPTION = "Binary files of amstex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn3006"

RPM_NAME = "texlive-amstex-bin-2026.20260301.svn3006-120.4.aarch64.rpm"
RPM_HASH = "fe702bd1f86850808c0b40eee04a8e85ad7d36fd6d9d5855a0b9a4841c0d8dc7d34223fe20793728334d7a2b4cc7974eda6fbcd0e161579e89fbadb2b8c1b0ce"

RPROVIDES:${PN} += "texlive-amstex-bin"

RDEPENDS:${PN} += "texlive-amstex"

inherit rpm
