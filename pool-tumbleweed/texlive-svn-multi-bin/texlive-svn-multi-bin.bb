SUMMARY = "Binary files of svn-multi"
DESCRIPTION = "Binary files of svn-multi"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13663"

RPM_NAME = "texlive-svn-multi-bin-2026.20260301.svn13663-120.4.aarch64.rpm"
RPM_HASH = "55da23763011fa90b022f7469dd98a995af75913583f0abb9816f4b90e6007054bd46da2e7a1003ab772f08ab79be1ee2223db1551b8e74b5ee89a447f6ecff3"

RPROVIDES:${PN} += "texlive-svn-multi-bin"

RDEPENDS:${PN} += "texlive-svn-multi"

inherit rpm
