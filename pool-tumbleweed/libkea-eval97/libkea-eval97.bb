SUMMARY = "Kea DHCP expression evaluation library"
DESCRIPTION = "The core of the libeval library is a parser that is able to parse an \
expression (e.g. option[123].text == 'APC'). This is currently used \
for client classification."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-eval97-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "3994cc039062b430826ea4a2c48ae0c45c95d642f0e973bf1d66ae9cb04ac257fa4ef08758daf496ad88b8507641da03504f91c72494f5b239e6508b640508b5"

RPROVIDES:${PN} += "libkea-eval.so.97 \
libkea-eval97"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-dhcp.so.129 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
