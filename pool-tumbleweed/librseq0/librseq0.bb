SUMMARY = "Library for Restartable Sequences"
DESCRIPTION = "RSEQ allows to determine when a thread is preempted while executing a \
critical section, after which the thread can retry its operation."
LICENSE = "MIT"

PV = "0~git159.313af7c"

RPM_NAME = "librseq0-0~git159.313af7c-1.11.aarch64.rpm"
RPM_HASH = "f416fdeb6b1be4ed8aae85d43e117e52f3a8fc8edf7378db8ba43d4be573a5771cc99dc3d5b714cfd49d81f7ab373108406e102c3fde1da3274e960ea57a5746"

RPROVIDES:${PN} += "librseq.so.0 \
librseq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
