SUMMARY = "Binary files of mex"
DESCRIPTION = "Binary files of mex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn3006"

RPM_NAME = "texlive-mex-bin-2026.20260301.svn3006-120.4.aarch64.rpm"
RPM_HASH = "bea726668b345747fd01ba7848976c9839988fb3690ca0cf42a04cae56fa6320a42de709520ec0df2ebbbc5ae5dce1f9c35445ca56eaf5e81f4f05e86e5e913c"

RPROVIDES:${PN} += "texlive-mex-bin"

RDEPENDS:${PN} += "texlive-mex"

inherit rpm
