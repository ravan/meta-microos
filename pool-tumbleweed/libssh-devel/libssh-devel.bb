SUMMARY = "SSH library development headers"
DESCRIPTION = "Development headers for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.5"

RPM_NAME = "libssh-devel-0.11.5-2.1.aarch64.rpm"
RPM_HASH = "6aaa09a608461822fb564cefcbf1f097fe7289bb9824f7d9312b3ba5a43aa689b51794431e98d1a2bc0c113bd8e83e41c4c39d83fd0d67967b52d3370f94a3b7"

RPROVIDES:${PN} += "cmake-libssh \
libssh-devel \
pkgconfig-libssh"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libssh4"

inherit rpm
