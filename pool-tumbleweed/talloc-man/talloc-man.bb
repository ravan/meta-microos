SUMMARY = "Samba talloc Library"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "talloc-man-2.4.4-1.2.aarch64.rpm"
RPM_HASH = "eb231188bf9d5b4182970e2987ae1c6dcb4b0642112d494adb97ceacf9be75a00c3c5a6f6d03da94cb9300f54662f58d2a25959b0c4600e40dd85073737b416f"

RPROVIDES:${PN} += "talloc-man"

RDEPENDS:${PN} += ""

inherit rpm
