SUMMARY = "GAP: ZeroMQ bindings"
DESCRIPTION = "ZeroMQ bindings for the GAP CAS."
LICENSE = "GPL-2.0-or-later"

PV = "0.18"

RPM_NAME = "gap-zeromqinterface-0.18-1.3.aarch64.rpm"
RPM_HASH = "5c2c0bed1af43af24ca4d4d556a988439d5a71ce2f88c126e26624564758a66321aed607a166af306078effb8e1640217d6eda755b431a0b24bc85cfd789f571"

RPROVIDES:${PN} += "gap-zeromqinterface"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
gap-core \
gap-gapdoc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5"

inherit rpm
