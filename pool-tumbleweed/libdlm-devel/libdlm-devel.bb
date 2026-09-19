SUMMARY = "Development files for the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libdlm-devel-4.3.0-2.5.aarch64.rpm"
RPM_HASH = "92a3a7563b4445dea481a9314dd7bc98b622304d72962145c8f9bd89632499d1d46adfaad050eba406144125aea109f088094bea7c54f2dcd77ddfaa689eb28a"

RPROVIDES:${PN} += "libdlm-devel \
pkgconfig-libdlm \
pkgconfig-libdlm-lt \
pkgconfig-libdlmcontrol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdlm3"

inherit rpm
