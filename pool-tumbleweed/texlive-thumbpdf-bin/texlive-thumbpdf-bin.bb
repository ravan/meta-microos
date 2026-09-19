SUMMARY = "Binary files of thumbpdf"
DESCRIPTION = "Binary files of thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn6898"

RPM_NAME = "texlive-thumbpdf-bin-2026.20260301.svn6898-120.4.aarch64.rpm"
RPM_HASH = "9d7513711ad20f31eef4d7b1dc2f6a0abe29c2d06523a5b4626e046ae785878b1c7c1bbabea21403322b4afbe87832052b4684733a4bf39d83355e9c18bed42d"

RPROVIDES:${PN} += "texlive-thumbpdf-bin"

RDEPENDS:${PN} += "texlive-thumbpdf"

inherit rpm
