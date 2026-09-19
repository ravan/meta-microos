SUMMARY = "Binary files of texaccents"
DESCRIPTION = "Binary files of texaccents"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn64447"

RPM_NAME = "texlive-texaccents-bin-2026.20260301.svn64447-120.4.aarch64.rpm"
RPM_HASH = "2780c9a01f307d27601c362f6b1fcd81c73496b9b76e7c573230fdca0bd2d8d7f9e99196bdc9479e9df2a5e2923e2e20171ca65359afc849d9e3a44014a78ca1"

RPROVIDES:${PN} += "texlive-texaccents-bin"

RDEPENDS:${PN} += "texlive-texaccents"

inherit rpm
