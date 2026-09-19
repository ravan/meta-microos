SUMMARY = "Binary files of pygmentex"
DESCRIPTION = "Binary files of pygmentex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn34996"

RPM_NAME = "texlive-pygmentex-bin-2026.20260301.svn34996-120.4.aarch64.rpm"
RPM_HASH = "55ceb30eb17e1069e7ec45a75d5865b378a75d6e9b216dff77edb4d3237859ee238c8bfbcf59d78afd725f4134945e6569d3a70bfa19acdb121757a719f1942e"

RPROVIDES:${PN} += "texlive-pygmentex-bin"

RDEPENDS:${PN} += "texlive-pygmentex"

inherit rpm
