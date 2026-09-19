SUMMARY = "Development Environment for the kyotocabinet Library"
DESCRIPTION = "This package contains the development environment (headers, shared \
library symlink, pkg-config file, ...) for libkyotocabinet16"
LICENSE = "SUSE-GPL-3.0-with-FLOSS-exception"

PV = "1.2.80"

RPM_NAME = "libkyotocabinet-devel-1.2.80-2.6.aarch64.rpm"
RPM_HASH = "3abfd178467f54f461ac720aaa7eb3ebee8295091c838de4aef056d1d92d6605396be04616a1d804210105c7258a1e44ce0c963d7857a8e986b4d4f89a13a8d8"

RPROVIDES:${PN} += "libkyotocabinet-devel \
libkyotocabinet16-devel \
pkgconfig-kyotocabinet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkyotocabinet16"

inherit rpm
