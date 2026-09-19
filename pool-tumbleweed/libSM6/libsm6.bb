SUMMARY = "X Session Management library"
DESCRIPTION = "The X Session Management Protocol provides a uniform mechanism for \
users to save and restore their sessions. A session is a group of X \
clients (programs), each of which has a particular state. The session \
is controlled by a network service called the session manager, which \
issues commands to its clients on behalf of the user. These commands \
may cause clients to save their state or to terminate. It is expected \
that the client will save its state in such a way that the client can \
be restarted at a later time and resume its operation as if it had \
never been terminated."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "libSM6-1.2.6-1.5.aarch64.rpm"
RPM_HASH = "bc76341dd712f088a4259420db65ce05172ccc7fbac5ed3962ff1ddd842a64f3b0072d2f7e56d943634dec9503ddbc212322856ba12468875f6ff027db8d9bff"

RPROVIDES:${PN} += "libSM.so.6 \
libSM6 \
xorg-x11-libSM"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libc.so.6 \
libuuid.so.1"

inherit rpm
