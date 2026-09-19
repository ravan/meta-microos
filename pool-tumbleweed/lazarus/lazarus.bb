SUMMARY = "FreePascal RAD IDE and Component Library"
DESCRIPTION = "Lazarus is an IDE to create (graphical and console) applications with \
Free Pascal, the (L)GPLed Pascal and Object Pascal compiler that runs on \
Windows, Linux, Mac OS X, FreeBSD and more. \
 \
Lazarus is the missing part of the puzzle that will allow you to develop \
programs for all of the above platforms in a Delphi-like environment. \
The IDE is a RAD tool that includes a form designer. \
 \
Unlike Java's 'write once, run anywhere' motto, Lazarus and Free Pascal \
strive for 'write once, compile anywhere'. Since the exact same compiler \
is available on all of the above platforms you don't need to do any recoding \
to produce identical products for different platforms. \
 \
In short, Lazarus is a free RAD tool for Free Pascal using its \
Lazarus Component Library (LCL)."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "4.8"

RPM_NAME = "lazarus-4.8-1.2.aarch64.rpm"
RPM_HASH = "f624c756351e4078b5dd2c929d09573a0edd48d76cf869fd703bf1712a1b900bcfaf57a2e20bc7390d9e4d5c516ea5e795ed6ffdc5610c465c89376695ddad6c"

RPROVIDES:${PN} += "lazarus"

RDEPENDS:${PN} += "binutils \
desktop-file-utils \
fpc \
fpc-src \
gcc \
gdb \
lazarus-ide \
lazarus-lcl \
lazarus-lcl-gtk2 \
lazarus-lcl-nogui \
lazarus-tools \
make \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0 \
shared-mime-info"

inherit rpm
