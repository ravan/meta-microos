SUMMARY = "Binary files of l3sys-query"
DESCRIPTION = "Binary files of l3sys-query"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn70681"

RPM_NAME = "texlive-l3sys-query-bin-2026.20260301.svn70681-120.4.aarch64.rpm"
RPM_HASH = "2d3c531dce251d1720d9f43cb50d7dc0a754cc6aee8ba0dd128926f58cd5eb60af8d061a27372d912f64a496873e48101a5e227382b3e4a86a3c80c3f8f079e4"

RPROVIDES:${PN} += "texlive-l3sys-query-bin"

RDEPENDS:${PN} += "texlive-l3sys-query"

inherit rpm
