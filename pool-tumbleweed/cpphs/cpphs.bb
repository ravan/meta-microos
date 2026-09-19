SUMMARY = "A liberalised re-implementation of cpp, the C pre-processor"
DESCRIPTION = "Cpphs is a re-implementation of the C pre-processor that is both more \
compatible with Haskell, and itself written in Haskell so that it can be \
distributed with compilers. \
 \
This version of the C pre-processor is pretty-much feature-complete and \
compatible with traditional (K&R) pre-processors. Additional features include: \
a plain-text mode; an option to unlit literate code files; and an option to \
turn off macro-expansion. \
 \
Old homepage: <https://archives.haskell.org/projects.haskell.org/cpphs/>."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.10"

RPM_NAME = "cpphs-1.20.10-1.11.aarch64.rpm"
RPM_HASH = "7537d89dfc1c934cbca8892f8951068855e41796d41e3f92c12b56675e433a3f2acb56d2686b2ea077aef21b1b78f131c7e8adc28f61f2e05d8619a97fe52092"

RPROVIDES:${PN} += "cpphs"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
