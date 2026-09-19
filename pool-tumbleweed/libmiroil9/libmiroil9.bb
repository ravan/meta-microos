SUMMARY = "Lomiri compatibility libraries for Mir"
DESCRIPTION = "This package provides the libraries for Lomiri to use Mir as a Wayland compositor"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmiroil9-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "921de5104332ec9ebf24742f8f5a93757d16bfd7dc0dba6030785f49d873ea84ad205d763deb3548d7afe8b33b779b5955d5ec37214e609b3d39a676b2e47978"

RPROVIDES:${PN} += "libmiroil.so.9 \
libmiroil9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmiral.so.7 \
libmircommon.so.12 \
libmircore.so.2 \
libmirserver.so.67 \
libstdc++.so.6"

inherit rpm
