SUMMARY = "Python3 bindings for libpathrs"
DESCRIPTION = "libpathrs implements a set of C-friendly APIs (written in Rust) to make path \
resolution within a potentially-untrusted directory safe on GNU/Linux. There \
are countless examples of security vulnerabilities caused by bad handling of \
paths (symlinks make the issue significantly worse). \
 \
This subpackage provides the Python bindings for libpathrs."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.2.6"

RPM_NAME = "python314-pathrs-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "35f39768cb220a96db10d03ef07c4146f13505e52a3cf07107c309e5fe0bbced30b920750b69851de0f5d2bd627de362446d493f75af9fa4aaf7a695f1bcedd8"

RPROVIDES:${PN} += "python3.14dist-pathrs \
python314-pathrs \
python3dist-pathrs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpathrs.so.0 \
libpathrs0 \
python-abi \
python3.14dist-cffi \
python3.14dist-typing-extensions"

inherit rpm
