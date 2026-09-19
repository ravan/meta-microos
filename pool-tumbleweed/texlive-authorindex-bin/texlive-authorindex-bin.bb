SUMMARY = "Binary files of authorindex"
DESCRIPTION = "Binary files of authorindex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn18790"

RPM_NAME = "texlive-authorindex-bin-2026.20260301.svn18790-120.4.aarch64.rpm"
RPM_HASH = "20861d791c2e188a38f4639b9b8c1f45bb7e0bc2878b0244cb2449340677614d2e62738fa26e580e1973109b7dbde4777e1832798f645776bb25577b3dc24e36"

RPROVIDES:${PN} += "texlive-authorindex-bin"

RDEPENDS:${PN} += "texlive-authorindex"

inherit rpm
