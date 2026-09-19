SUMMARY = "Development for librseq, a library for restartable sequences"
DESCRIPTION = "RSEQ allows to determine when a thread is preempted while executing a \
critical section, after which the thread can retry its operation. \
 \
This package contains headers for the library."
LICENSE = "MIT"

PV = "0~git159.313af7c"

RPM_NAME = "librseq-devel-0~git159.313af7c-1.11.aarch64.rpm"
RPM_HASH = "9f9aafc36bd3a431f2839a0bc332bebb8fcda911d05d4d82219f975fa9d81fb881c31249074afde489b90966b6523083f439fce6b5a5a18dc1c3e65b07ae72f7"

RPROVIDES:${PN} += "librseq-devel \
pkgconfig-librseq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librseq0"

inherit rpm
