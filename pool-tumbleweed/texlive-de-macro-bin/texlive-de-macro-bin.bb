SUMMARY = "Binary files of de-macro"
DESCRIPTION = "Binary files of de-macro"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn17399"

RPM_NAME = "texlive-de-macro-bin-2026.20260301.svn17399-120.4.aarch64.rpm"
RPM_HASH = "65d062efc87900b474f38e13b3d493d757ad435dd2c3bc27892773694ba5eb2b5b05fdea75597e48e2bdb5d747bc3a36fe5fc9ff66ecdda978b5872f19598447"

RPROVIDES:${PN} += "texlive-de-macro-bin"

RDEPENDS:${PN} += "texlive-de-macro"

inherit rpm
