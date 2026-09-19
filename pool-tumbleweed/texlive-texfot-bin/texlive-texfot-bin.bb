SUMMARY = "Binary files of texfot"
DESCRIPTION = "Binary files of texfot"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn33155"

RPM_NAME = "texlive-texfot-bin-2026.20260301.svn33155-120.4.aarch64.rpm"
RPM_HASH = "ac5869ff75b2b55eeea5df07f21154f8b18b06579d768d98d1a8dc968083e4f817cc622bfa3872154b698c7f25bb4a3059015fb8cc2abb6f2721a3145c3f118a"

RPROVIDES:${PN} += "texlive-texfot-bin"

RDEPENDS:${PN} += "texlive-texfot"

inherit rpm
