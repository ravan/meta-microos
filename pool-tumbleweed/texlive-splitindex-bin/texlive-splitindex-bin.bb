SUMMARY = "Binary files of splitindex"
DESCRIPTION = "Binary files of splitindex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29688"

RPM_NAME = "texlive-splitindex-bin-2026.20260301.svn29688-120.4.aarch64.rpm"
RPM_HASH = "f988788bee72f420f2f5b9c63322bb8963cf2798d145e5fde8c3f2e3c1625342ddc80c7358dd2bd17e74561387f736471c70f95595f7f266a1a4c40e7b9ec535"

RPROVIDES:${PN} += "texlive-splitindex-bin"

RDEPENDS:${PN} += "texlive-splitindex"

inherit rpm
