SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libatomic1-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "f9ffe816efd3f07bb06a3bdaf007fb14ac208630fb13798ceeb22bd34814a809cd889f061fdfdb073fd3197d7fc122082fa831d21676a199d087a67d3ce074ff"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
