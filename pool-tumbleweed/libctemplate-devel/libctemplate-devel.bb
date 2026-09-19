SUMMARY = "Development files for ctemplate, a C++ language templating library"
DESCRIPTION = "CTemplate is a template language for C++. It emphasizes separating \
logic from presentation: it is impossible to embed application logic \
in this template language."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "libctemplate-devel-2.4-2.1.aarch64.rpm"
RPM_HASH = "2c4df83fbc8dec61db91c4467b6e99ef91b0f4795011dda8dcd75c1df27de80aceff09274fda399fc56baf4165b468ec63f981045195ae32a393eb68e4948169"

RPROVIDES:${PN} += "libctemplate-devel \
pkgconfig-libctemplate \
pkgconfig-libctemplate-nothreads"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctemplate-nothreads.so.3 \
libctemplate3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
