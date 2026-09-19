SUMMARY = "Cross-platform library for games and multimedia programming"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. \
 \
A wide range of extension packages and add-on modules are also available, which \
can be found in the 'Library Extensions' section of the Allegro website."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "f08ed94a6fea33e820858c488e33ac9fcab948df6219b99f409d5293817bd605e2751352ea5257ff8def7dde0a27854b6c2aa949f843e8e027f3696c7581ceca"

RPROVIDES:${PN} += "allegro44"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libasound.so.2 \
libc.so.6"

inherit rpm
