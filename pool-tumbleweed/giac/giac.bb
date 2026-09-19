SUMMARY = "Computer algebra system"
DESCRIPTION = "giac is a computer algebra system, compatible with existing CAS, as a \
C++ library with various user interfaces, such as xcas (GUI with \
formal spreadsheet and exact dynamic geometry), icas (readline), \
on-line mode, and emacs/texmacs integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "giac-2.0.0-2.6.aarch64.rpm"
RPM_HASH = "040cb3c38bb0cc32b5551bd31c668c89c74869a5ab82bd68a4ff7b1a7c95b9839bc6e26fc59f7422e4b23d3c941bca8d376d843d54aabeb0999ef3af46d50895"

RPROVIDES:${PN} += "giac"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgiac.so.0 \
libgsl.so.28 \
libreadline.so.8 \
libstdc++.so.6 \
libxcas.so.0"

inherit rpm
