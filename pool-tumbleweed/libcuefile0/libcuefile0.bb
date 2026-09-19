SUMMARY = "Library for Working With Cue Sheet (cue) and Table Of Contents (toc) Files"
DESCRIPTION = "libcuefile is a library for working with Cue Sheet (cue) and Table of Contents \
(toc) files."
LICENSE = "GPL-2.0-only"

PV = "r475"

RPM_NAME = "libcuefile0-r475-4.9.aarch64.rpm"
RPM_HASH = "34a1f2e623debf16671e933b19663a9cbee8b4f5bc37bb611171c22d0fd0b04a917a961ba1b7d963e859443e24989ec7dd2aa33c77ceca709f4ae0fde92a7852"

RPROVIDES:${PN} += "libcuefile.so.0 \
libcuefile0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
