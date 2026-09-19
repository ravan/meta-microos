SUMMARY = "Static library for libpathrs"
DESCRIPTION = "libpathrs implements a set of C-friendly APIs (written in Rust) to make path \
resolution within a potentially-untrusted directory safe on GNU/Linux. There \
are countless examples of security vulnerabilities caused by bad handling of \
paths (symlinks make the issue significantly worse). \
 \
This subpackage contains the static version of libpathrs used for development."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.2.6"

RPM_NAME = "libpathrs-devel-static-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "0d63d18a80341a293279f68e982deda4d908d16d34289dc6a35386df8f8fa550e6841befeb9216d825d06b4a5aa8b21480739b8fa52a372128e283fab3b4c857"

RPROVIDES:${PN} += "libpathrs-devel-/usr/lib64/libpathrs.a \
libpathrs-devel-static"

RDEPENDS:${PN} += "libpathrs-devel"

inherit rpm
