SUMMARY = "Headers for the Unwind library"
DESCRIPTION = "A set of C programming interfaces to determine the call chain within a running \
program (libunwind), of a coredump image (libunwind-coredump), or of a separate \
process (libunwind-ptrace)."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "libunwind-devel-1.8.3-3.3.aarch64.rpm"
RPM_HASH = "df8b82ed09289993d3c6c32355f85ba78bb701fb53b61a79b54ec3984c53998667e63962a47a002d5dc8e3e6b638668959fbcda712d72fbf0750022a5908ed09"

RPROVIDES:${PN} += "libunwind-devel \
pkgconfig-libunwind \
pkgconfig-libunwind-coredump \
pkgconfig-libunwind-generic \
pkgconfig-libunwind-ptrace \
pkgconfig-libunwind-setjmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunwind-coredump0 \
libunwind-ptrace0 \
libunwind-setjmp0 \
libunwind8 \
pkgconfig-libunwind \
pkgconfig-libunwind-generic"

inherit rpm
