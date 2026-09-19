SUMMARY = "Sendmsg, recvmsg and ancillary data operations"
DESCRIPTION = "Socket::MsgHdr provides advanced socket messaging operations via sendmsg \
and recvmsg. Like their C counterparts, these functions accept few \
parameters, instead stuffing a lot of information into a complex structure. \
 \
This structure describes the message sent or received (buf), the peer on \
the other end of the socket (name), and ancillary or so-called control \
information (cmsghdr). This ancillary data may be used for file descriptor \
passing, IPv6 operations, and a host of implemenation-specific extensions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.60.0"

RPM_NAME = "perl-Socket-MsgHdr-0.60.0-1.1.aarch64.rpm"
RPM_HASH = "45d7f6b388691e579e63074164a62c7eae48ff80602d8835569957dd03c59377e83e346eeb3eb4d44699fff50c3d63b6b98db4869e864e2a22c05f5fd4e7a167"

RPROVIDES:${PN} += "perl-Socket--MsgHdr \
perl-Socket-MsgHdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
