SUMMARY = "Binary files of mptopdf"
DESCRIPTION = "Binary files of mptopdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn18674"

RPM_NAME = "texlive-mptopdf-bin-2026.20260301.svn18674-120.4.aarch64.rpm"
RPM_HASH = "3634cc770764ff7bbf49e33890df82ec9fb9d331474cbb8865a8aa60139e50b91e28314baf75b6b9d507ecd8f38ef502f91700deacc395c25903d8dc1610c4cd"

RPROVIDES:${PN} += "texlive-mptopdf-bin"

RDEPENDS:${PN} += "texlive-mptopdf"

inherit rpm
