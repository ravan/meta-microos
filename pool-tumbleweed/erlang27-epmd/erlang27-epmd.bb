SUMMARY = "Erlang Port Mapper daemon"
DESCRIPTION = "The Erlang Port Mapper daemon acts as a name server on all hosts involved in distributed Erlang computations."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-epmd-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "e967be412078e3f767c1884ccd2443df8b4e94e2ba1ea53279be2db03f47005f2455017d9a0310511414a7787f2fa35bccbeacdd5ac2aacb4d7cc53d2089b57f"

RPROVIDES:${PN} += "erlang-epmd \
erlang27-epmd \
group-epmd \
user-epmd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
erlang27 \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
