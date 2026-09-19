SUMMARY = "Binary files of dtxgen"
DESCRIPTION = "Binary files of dtxgen"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29031"

RPM_NAME = "texlive-dtxgen-bin-2026.20260301.svn29031-120.4.aarch64.rpm"
RPM_HASH = "0d0a1ac74d56f9c7c46277d92ec274626d986c9b5552f431bc6ba166a5d64da01a2d6e3d9b6aba81c03150565d0141f19ffdcaed9dbcdc81f7b70e7eff7ca7b1"

RPROVIDES:${PN} += "texlive-dtxgen-bin"

RDEPENDS:${PN} += "texlive-dtxgen"

inherit rpm
