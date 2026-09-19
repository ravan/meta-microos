SUMMARY = "Binary files of texfindpkg"
DESCRIPTION = "Binary files of texfindpkg"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn66777"

RPM_NAME = "texlive-texfindpkg-bin-2026.20260301.svn66777-120.4.aarch64.rpm"
RPM_HASH = "bae38a01e3ad9c948424441704ea7ed8640864e656f1282818c0eb54d9c36b912bdaa3502dd208e906ba4d291e624ce7b762ec2bfca216a311044110fc7d443a"

RPROVIDES:${PN} += "texlive-texfindpkg-bin"

RDEPENDS:${PN} += "texlive-texfindpkg"

inherit rpm
