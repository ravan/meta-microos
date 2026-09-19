SUMMARY = "Binary files of easydtx"
DESCRIPTION = "Binary files of easydtx"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn68514"

RPM_NAME = "texlive-easydtx-bin-2026.20260301.svn68514-120.4.aarch64.rpm"
RPM_HASH = "b5cdf568795d70119ad7c383549025788aa9778ba214700958a1c2c01bb9a79c95e40648b584d25a7af5d34eb961a008c93bbbae73b68cf3fef86b7f78b4001c"

RPROVIDES:${PN} += "texlive-easydtx-bin"

RDEPENDS:${PN} += "texlive-easydtx"

inherit rpm
