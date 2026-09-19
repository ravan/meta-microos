SUMMARY = "Init and service manager"
DESCRIPTION = "The GNU Daemon Shepherd or GNU Shepherd, formerly known as GNU dmd, is \
a service manager that looks after the herd of system services. It \
provides a replacement for the service-managing capabilities of \
SysV-init (or any other init). It is intended \
for use on GNU/Hurd, but it is supposed to work on every POSIX-like \
system where Guile is available. In particular, it is used as PID 1 by \
GNU Guix."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.2"

RPM_NAME = "shepherd-0.10.2-1.10.aarch64.rpm"
RPM_HASH = "330110a5327aad75e59d0231b31208b325b7f946842f35806eb0844d81fc4de85c3e754a916750b8169b06fe9a9b0a46403eec0c45dd1990baa91f8a0a018d45"

RPROVIDES:${PN} += "shepherd"

RDEPENDS:${PN} += "/usr/bin/guile \
/usr/bin/sh \
libc.so.6"

inherit rpm
