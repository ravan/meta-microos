SUMMARY = "Binary files of a2ping"
DESCRIPTION = "Binary files of a2ping"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn27321"

RPM_NAME = "texlive-a2ping-bin-2026.20260301.svn27321-120.4.aarch64.rpm"
RPM_HASH = "a63dfcb8afde929e60dde8fd9c8fff49badcd48691821d832fc0acd1885f2596c3e887474f8825511cb10a33e28d8a26eed9dfdb64b3170cec3433573d50fb7d"

RPROVIDES:${PN} += "texlive-a2ping-bin"

RDEPENDS:${PN} += "texlive-a2ping"

inherit rpm
