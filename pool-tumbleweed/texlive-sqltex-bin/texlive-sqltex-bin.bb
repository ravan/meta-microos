SUMMARY = "Binary files of sqltex"
DESCRIPTION = "Binary files of sqltex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn72338"

RPM_NAME = "texlive-sqltex-bin-2026.20260301.svn72338-120.4.aarch64.rpm"
RPM_HASH = "31c474edd7ad0fc527c5d92ec475a95d5fc55c4c397a7a7ea25408e9014b8dddf649e8ede807ec403aa50cf87d8d719d4820ee443fbd77c21fba35ab4fe88ba5"

RPROVIDES:${PN} += "texlive-sqltex-bin"

RDEPENDS:${PN} += "texlive-sqltex"

inherit rpm
