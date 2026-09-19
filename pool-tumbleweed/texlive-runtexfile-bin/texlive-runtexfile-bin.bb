SUMMARY = "Binary files of runtexfile"
DESCRIPTION = "Binary files of runtexfile"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn75830"

RPM_NAME = "texlive-runtexfile-bin-2026.20260301.svn75830-120.4.aarch64.rpm"
RPM_HASH = "531282e0ae21616d5cbdcd1f42c14fef521d74a8e5ce984520e3fae58b802131364765b1b20e43c737d23b6f0de99d4d7b3e5d76c16d9f5670779311787d2c1d"

RPROVIDES:${PN} += "texlive-runtexfile-bin"

RDEPENDS:${PN} += "texlive-runtexfile"

inherit rpm
