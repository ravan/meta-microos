SUMMARY = "Binary files of context"
DESCRIPTION = "Binary files of context"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78010"

RPM_NAME = "texlive-context-bin-2026.20260301.svn78010-120.4.aarch64.rpm"
RPM_HASH = "bb4bad0c7d7f5bce91928a4b05b825402a043c877de5709ebede349b3c83cbaf7e2279b6440a1471fd125e2f86ae516ab9afa18290929eff40bc6860addef40f"

RPROVIDES:${PN} += "texlive-context-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-context"

inherit rpm
