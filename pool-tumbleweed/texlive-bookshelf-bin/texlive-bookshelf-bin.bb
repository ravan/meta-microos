SUMMARY = "Binary files of bookshelf"
DESCRIPTION = "Binary files of bookshelf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn72501"

RPM_NAME = "texlive-bookshelf-bin-2026.20260301.svn72501-120.4.aarch64.rpm"
RPM_HASH = "e219d16e9eaf3dd10d2065d6a3214ac050967b312aa0c19a06c0eb074c97282ba68c7cebe58cdf81cde45e457de4420bcfa833796048aa190740899e748e9065"

RPROVIDES:${PN} += "texlive-bookshelf-bin"

RDEPENDS:${PN} += "texlive-bookshelf"

inherit rpm
