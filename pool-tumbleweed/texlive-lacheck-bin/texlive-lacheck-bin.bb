SUMMARY = "Binary files of lacheck"
DESCRIPTION = "Binary files of lacheck"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-lacheck-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "48a43bf2b02303dc91d26688033a95624fda9e1883783e8a4ecff9511415d6268ba2d4d013b8eff94f59dce1cea2e1394afa38a4b3ebd165b255692a3fb7683b"

RPROVIDES:${PN} += "texlive-lacheck-bin"

RDEPENDS:${PN} += "libc.so.6 \
texlive-lacheck"

inherit rpm
