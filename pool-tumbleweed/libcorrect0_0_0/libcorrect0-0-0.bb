SUMMARY = "C library for Convolutional codes and Reed-Solomon"
DESCRIPTION = "libcorrect is a library for Forward Error Correction. By using libcorrect, \
extra redundancy can be encoded into a packet of data and then be sent \
across a lossy channel. When the packet is received, it can be decoded to \
recover the original, pre-encoded data. \
 \
libcorrect accomplishes this task with two algorithms, Convolutional codes \
and Reed-Solomon. Convolutional codes are robust to a constant background \
noise, while Reed-Solomon error correction is effective at dealing with \
noise that occurs in bursts. These algorithms have played an important role \
in telecommunications. libcorrect uses a Viterbi algorithm decoder to decode \
convolutional codes."
LICENSE = "BSD-3-Clause"

PV = "20181010"

RPM_NAME = "libcorrect0_0_0-20181010-1.6.aarch64.rpm"
RPM_HASH = "d56ca17e8a85a4ab1b3f1f86f11b50d96462a2d6f40ae8cfd0a7d707d1e865b5dc13a4e6c17900c61be563930563ad2e4ae2d8eee83db62c1e9fc90ac9e25cd7"

RPROVIDES:${PN} += "libcorrect.so.0.0.0 \
libcorrect0-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
