SUMMARY = "Libcap utility programs"
DESCRIPTION = "This package contains utility programs handling capabilities via \
libcap."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.78"

RPM_NAME = "libcap-progs-2.78-1.4.aarch64.rpm"
RPM_HASH = "4eff68443ebf37f4ee48cd114127a97de52b046d1c4e7fc44dbbc284ddcbd75ae84b27531c8b82956bfcac7c348341a03626cbf9fdd00c8de2b861f794e72986"

RPROVIDES:${PN} += "libcap-progs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcap2"

inherit rpm
