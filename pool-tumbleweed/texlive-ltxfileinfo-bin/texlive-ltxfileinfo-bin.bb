SUMMARY = "Binary files of ltxfileinfo"
DESCRIPTION = "Binary files of ltxfileinfo"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29005"

RPM_NAME = "texlive-ltxfileinfo-bin-2026.20260301.svn29005-120.4.aarch64.rpm"
RPM_HASH = "e67ccec54c7c0bc2dfefa0334087d3dd8e76a346bca010399e48a29a5a8832bfe4e72b8097086459705bfc848a6e3bd2842d93a886517c8af5253553eb8d1d5a"

RPROVIDES:${PN} += "texlive-ltxfileinfo-bin"

RDEPENDS:${PN} += "texlive-ltxfileinfo"

inherit rpm
