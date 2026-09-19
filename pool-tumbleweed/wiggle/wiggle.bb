SUMMARY = "A Tool for Applying Patches with Conflicts"
DESCRIPTION = "Wiggle is a program for applying patches that 'patch' cannot apply due \
to conflicting changes in the original. \
 \
Wiggle will always apply all changes in the patch to the original. If \
it cannot find a way to cleanly apply a patch, it inserts it in the \
original in a manner similar to 'merge' and reports an unresolvable \
conflict."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "wiggle-1.3-1.22.aarch64.rpm"
RPM_HASH = "26fa515bbfff21579aa54c7b21ee1184347fedcd625dcb52a668e428bd6acc5c87fa07ea3976df976d667f70237409b8697bbf77b7349f46781a178555d433a4"

RPROVIDES:${PN} += "wiggle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
