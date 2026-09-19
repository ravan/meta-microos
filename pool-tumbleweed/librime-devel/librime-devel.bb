SUMMARY = "Development files of Rime"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the development headers of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "librime-devel-1.17.0-1.1.aarch64.rpm"
RPM_HASH = "4d6760b9f58dc2bfa2a99d617b273f622e331d6183850c75d46d7ccfbf9caf1156265be4624b04d6d2634787f5bc6f1ea26b2c8fa8d55ef1dc32f7b8d645c9fd"

RPROVIDES:${PN} += "cmake-Rime \
librime-devel \
pkgconfig-rime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
rime"

inherit rpm
