SUMMARY = "Binary files of runtexshebang"
DESCRIPTION = "Binary files of runtexshebang"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn68232"

RPM_NAME = "texlive-runtexshebang-bin-2026.20260301.svn68232-120.4.aarch64.rpm"
RPM_HASH = "98cd24f987661b64b2bff2e2c4af519c1c8caa3deedffde0252bfdf1db9a59c89c3f36ac49e44da5d3aa06bad42dd7e88a5dab3f6f7c0ff5ac8b94d1f46169af"

RPROVIDES:${PN} += "texlive-runtexshebang-bin"

RDEPENDS:${PN} += "texlive-runtexshebang"

inherit rpm
