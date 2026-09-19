SUMMARY = "Binary files of vpe"
DESCRIPTION = "Binary files of vpe"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn6897"

RPM_NAME = "texlive-vpe-bin-2026.20260301.svn6897-120.4.aarch64.rpm"
RPM_HASH = "f6e8311a7c303712d80f2b801e917e1a3eed2123d29f8651b8c387ba187802b0c5792783355b40c8c6e69323251bdf8e94105f25faf39d9f4a0c338b2678cbe6"

RPROVIDES:${PN} += "texlive-vpe-bin"

RDEPENDS:${PN} += "texlive-vpe"

inherit rpm
