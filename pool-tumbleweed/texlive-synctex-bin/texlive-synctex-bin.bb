SUMMARY = "Binary files of synctex"
DESCRIPTION = "Binary files of synctex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78082"

RPM_NAME = "texlive-synctex-bin-2026.20260301.svn78082-120.4.aarch64.rpm"
RPM_HASH = "2d97bf88752053c146665bd49c72076722fd53800a94c7ac80b0dbf7a2f84dcc563246a46e127f802a6700ce41eb1840e9d01a5fb2be1e4308af138544911bd5"

RPROVIDES:${PN} += "texlive-synctex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsynctex.so.2 \
texlive-synctex"

inherit rpm
