SUMMARY = "Binary files of autosp"
DESCRIPTION = "Binary files of autosp"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-autosp-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "413fb8bbda99fbbeb77e27df604754a9b8a402c8e7d76beb8a4942dc9fa90f013abfe100a9fa603987f29e97842788efc5cee444494a8c79f455fa41d1b0fb22"

RPROVIDES:${PN} += "texlive-autosp-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-autosp"

inherit rpm
