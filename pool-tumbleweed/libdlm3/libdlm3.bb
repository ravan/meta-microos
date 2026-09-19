SUMMARY = "Application interface to the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libdlm3-4.3.0-2.5.aarch64.rpm"
RPM_HASH = "5d16ed5455cc8ac96dff373357a2ec726f0a0d70cf2f3cef02aa8d39c0e96fda3503a582656f6f5675f9202065e8471f7866d536a3f69f5c988f1c127758ebb3"

RPROVIDES:${PN} += "libdlm-lt.so.3 \
libdlm.so.3 \
libdlm3 \
libdlmcontrol.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
