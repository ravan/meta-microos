SUMMARY = "Erlang Port Mapper daemon"
DESCRIPTION = "The Erlang Port Mapper daemon acts as a name server on all hosts involved in distributed Erlang computations."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-epmd-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "7046f80264a954e854780126bb0e49b4ed4e1a0f74f3a2e37036b636ee97681c1b4960e5a4db7108a099a15a95871b1a821479d372c2608c7eccf9a141a8776e"

RPROVIDES:${PN} += "erlang-epmd \
group-epmd \
user-epmd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
erlang \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
