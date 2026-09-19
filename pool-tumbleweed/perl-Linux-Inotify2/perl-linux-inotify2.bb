SUMMARY = "Scalable directory/file change notification"
DESCRIPTION = "This module implements an interface to the Linux 2.6.13 and later Inotify \
file/directory change notification system. \
 \
It has a number of advantages over the Linux::Inotify module: \
 \
   - it is portable (Linux::Inotify only works on x86) \
   - the equivalent of fullname works correctly \
   - it is better documented \
   - it has callback-style interface, which is better suited for \
     integration. \
 \
As for the inotify API itself - it is a very tricky, and somewhat \
unreliable API. For a good overview of the challenges you might run into, \
see this LWN article: https://lwn.net/Articles/605128/."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.300.0"

RPM_NAME = "perl-Linux-Inotify2-2.300.0-1.10.aarch64.rpm"
RPM_HASH = "c8bd8ff204a8286140bb093f8519733e3375570aea84d240b1353ebc53a3c87438f66517a73a87052b27d63af7f6a56641719831faff820921a8406d71b65023"

RPROVIDES:${PN} += "perl-Linux--Inotify2 \
perl-Linux--Inotify2--Event \
perl-Linux--Inotify2--Watch \
perl-Linux-Inotify2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-common--sense"

inherit rpm
