SUMMARY = "A tool to possibly recover deleted content on ext3 file systems"
DESCRIPTION = "A tool to investigate an ext3 file system for deleted content and possibly recover it. \
 \
Also see http://www.xs4all.nl/~carlo17/howto/undelete_ext3.html"
LICENSE = "GPL-2.0-only"

PV = "0.10.2"

RPM_NAME = "ext3grep-0.10.2-9.28.aarch64.rpm"
RPM_HASH = "f2718cbed6cd72cb4e57bb3a48f89f64941fa40844e97f8db71ef6adcc35510980bb506de300382add0b0e80a36cf86924bf00f642571aebeff4a21f890a7f7f"

RPROVIDES:${PN} += "ext3grep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
