SUMMARY = "Binary files of texdef"
DESCRIPTION = "Binary files of texdef"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn45011"

RPM_NAME = "texlive-texdef-bin-2026.20260301.svn45011-120.4.aarch64.rpm"
RPM_HASH = "fa98de59bfcb80e74b5994fd0bb6b2d84fedb81e2c59c6d8142fc7f5982d8490ed90aad86829c7743d1d535dc62e122f2ad0f2828bdba724030b0be1a8e6cfbf"

RPROVIDES:${PN} += "texlive-texdef-bin"

RDEPENDS:${PN} += "texlive-texdef"

inherit rpm
