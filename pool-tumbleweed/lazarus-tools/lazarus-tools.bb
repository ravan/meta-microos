SUMMARY = "Lazarus IDE helper programs"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package provides helper programs used for building Lazarus projects."
LICENSE = "GPL-2.0-or-later"

PV = "4.8"

RPM_NAME = "lazarus-tools-4.8-1.2.aarch64.rpm"
RPM_HASH = "1a43ee9e2f4e3ae6bea3ffed2a142cbf8b07e385f26bbe584695e1d1c8021d79fe3c55bbbc4553708383bd2ec706eb4c0efe6cd810b31cc0f2d1ecc9f5715ef3"

RPROVIDES:${PN} += "config-lazarus-tools \
lazarus-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/instantfpc \
/usr/bin/perl \
/usr/bin/sh \
binutils \
fpc \
glibc-devel \
libc.so.6"

inherit rpm
