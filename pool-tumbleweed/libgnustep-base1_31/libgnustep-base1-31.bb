SUMMARY = "GNUstep Base library package"
DESCRIPTION = "The GNUstep Base Library is a library of general-purpose, \
non-graphical Objective C classes, inspired by the \
OpenStep API but implementing Apple and GNU additions to the API \
as well.  It includes, for example, classes for Unicode strings, \
arrays, dictionaries, sets, byte streams, typed coders, invocations, \
notifications, notification dispatchers, scanners, tasks, files, \
networking, threading, remote object messaging support (distributed \
objects), event loops, loadable bundles, attributed Unicode strings, \
XML, MIME, user defaults."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.31.1"

RPM_NAME = "libgnustep-base1_31-1.31.1-2.8.aarch64.rpm"
RPM_HASH = "30db7d0e7bcf664c2568f65d70ccb972f289a7e3917cb5dbced2703fc3f46d4beb6b05fd9562ddd9756c488a001a3ee6f5031a773a7b62ae6246dcc4267868cb"

RPROVIDES:${PN} += "libgnustep-base.so.1.31 \
libgnustep-base1-31"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libffi.so.8 \
libgcc-s.so.1 \
libgnutls.so.30 \
libicui18n.so.78 \
libm.so.6 \
libobjc.so.4 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1"

inherit rpm
