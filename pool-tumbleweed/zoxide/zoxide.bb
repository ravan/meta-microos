SUMMARY = "A smarter cd command"
DESCRIPTION = "zoxide is a smarter cd command, inspired by z and autojump. It remembers \
which directories you use most frequently, so you can 'jump' to them in \
just a few keystrokes."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "zoxide-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "0e96a9ee798ea7ed09056ef6f26ddd0f0d3f57da7ff7171cdd2eb3e08861d05e0b254282149ebde43aef54c133f962c54ca0511787953b297adddb0da842c7d4"

RPROVIDES:${PN} += "zoxide"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
