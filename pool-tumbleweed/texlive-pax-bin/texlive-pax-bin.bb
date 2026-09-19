SUMMARY = "Binary files of pax"
DESCRIPTION = "Binary files of pax"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn10843"

RPM_NAME = "texlive-pax-bin-2026.20260301.svn10843-120.4.aarch64.rpm"
RPM_HASH = "6a4c54a1d2e1d75e13b846c588e9a34c6a627a1679144dfbf5cc52afdfd31947c86c21a780244a5a2b9cb09738226b7b391c7a5f7b3ab1951c0e881e56c7c137"

RPROVIDES:${PN} += "texlive-pax-bin"

RDEPENDS:${PN} += "texlive-pax"

inherit rpm
