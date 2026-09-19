SUMMARY = "Binary files of perltex"
DESCRIPTION = "Binary files of perltex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn16181"

RPM_NAME = "texlive-perltex-bin-2026.20260301.svn16181-120.4.aarch64.rpm"
RPM_HASH = "e86ae8184a92202f6b45a48b4a23469a7c79dd36206b3519c70b3d4a924d3a285aacd47facb024481c560032822ab949f081529e2cfddaeb205180e84af2c52b"

RPROVIDES:${PN} += "texlive-perltex-bin"

RDEPENDS:${PN} += "texlive-perltex"

inherit rpm
