SUMMARY = "Python3 bindings for libpathrs"
DESCRIPTION = "libpathrs implements a set of C-friendly APIs (written in Rust) to make path \
resolution within a potentially-untrusted directory safe on GNU/Linux. There \
are countless examples of security vulnerabilities caused by bad handling of \
paths (symlinks make the issue significantly worse). \
 \
This subpackage provides the Python bindings for libpathrs."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.2.6"

RPM_NAME = "python313-pathrs-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "097627fb48a2b5e255f9e9ad078616d25e66e4888e6c671c9e4f94eed60a90a3c90b34dd21ed6b1bde10fd86151a93d3c39c81b15416b0cc9ded1795751fb0ab"

RPROVIDES:${PN} += "python3-pathrs \
python3.13dist-pathrs \
python313-pathrs \
python3dist-pathrs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpathrs.so.0 \
libpathrs0 \
python-abi \
python3.13dist-cffi \
python3.13dist-typing-extensions"

inherit rpm
