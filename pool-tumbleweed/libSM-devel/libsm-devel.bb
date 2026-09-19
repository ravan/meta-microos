SUMMARY = "Development files for the X Session Management library"
DESCRIPTION = "The X Session Management Protocol provides a uniform mechanism for \
users to save and restore their sessions. A session is a group of X \
clients (programs), each of which has a particular state. The session \
is controlled by a network service called the session manager, which \
issues commands to its clients on behalf of the user. These commands \
may cause clients to save their state or to terminate. It is expected \
that the client will save its state in such a way that the client can \
be restarted at a later time and resume its operation as if it had \
never been terminated. \
 \
This package contains the development headers for the library found \
in libSM6."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "libSM-devel-1.2.6-1.5.aarch64.rpm"
RPM_HASH = "e31832d327ef664aa878bd98300d17db3f4acc2f744c43398d77ee45b94f3e17c5bf268acef99631cc4dba9e5555aba1a93967c9f8773c6dd074e9c905c0249a"

RPROVIDES:${PN} += "libSM-devel \
pkgconfig-sm \
xorg-x11-libSM-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSM6 \
pkgconfig-ice \
pkgconfig-uuid \
pkgconfig-xproto"

inherit rpm
