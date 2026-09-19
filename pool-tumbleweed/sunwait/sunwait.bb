SUMMARY = "Sunrise, sunset and twilight calculator"
DESCRIPTION = "Sunwait is a small C program for calculating sunrise and sunset, as well as \
civil, nautical, and astronomical twilights. It has features that make it \
useful for home automation tasks."
LICENSE = "GPL-2.0-or-later"

PV = "20220613"

RPM_NAME = "sunwait-20220613-1.15.aarch64.rpm"
RPM_HASH = "eadad4c072af89d1f44279061b8f96b8e2a65e08f76f681b9dfa671d87658743c18bf839ba704d0114f2767139e123df3012bc7ac1547a6c8f0f5f07f2e36ca3"

RPROVIDES:${PN} += "sunwait"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
