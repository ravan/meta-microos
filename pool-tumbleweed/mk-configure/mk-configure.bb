SUMMARY = "A build system on top of bmake"
DESCRIPTION = "mk-configure is a collection of include files for bmake (portable version of \
NetBSD make) and a number of executables. It is intended to aid cross-platform \
development and software building."
LICENSE = "BSD-2-Clause & MIT & ISC"

PV = "0.40.0"

RPM_NAME = "mk-configure-0.40.0-1.4.noarch.rpm"
RPM_HASH = "01220b3d878182c8a48778cd825e3ae655ca758a86d8fd02887c9903cb3d1e4b0d2d3812ea0d916750427c7801877eb7cd47fabcb2e46bebe760fb3dd2901470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mk-configure \
mk-configure-rpm-macros \
rpm-macro-mkcmake"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/sh \
bmake \
bmkdep"

inherit rpm
