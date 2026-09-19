SUMMARY = "Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
SRTP is a security profile for RTP that adds confidentiality, message \
authentication, and replay protection to that protocol. It is \
specified in RFC 3711. More information about the SRTP protocol \
itself can be found on the Secure RTP page."
LICENSE = "BSD-3-Clause"

PV = "2.4.2~git.20240220"

RPM_NAME = "libsrtp2-linphone1-2.4.2~git.20240220-1.6.aarch64.rpm"
RPM_HASH = "ee7ce7e5c19956c806f6ed5489526da90112bb257820723bbf9c0946c0ad49faa900735dc7a901a7218d2e0a9c56bf8271693d585f0811459dee639be17bcf78"

RPROVIDES:${PN} += "libsrtp2-linphone.so.1 \
libsrtp2-linphone1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
