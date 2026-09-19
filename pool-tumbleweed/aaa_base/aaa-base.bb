SUMMARY = "openSUSE Base Package"
DESCRIPTION = "This package installs several important configuration files and central scripts."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20260610.3b5a868c"

RPM_NAME = "aaa_base-84.87+git20260610.3b5a868c-1.3.aarch64.rpm"
RPM_HASH = "10791f9393397107cb79025d3c9b5231f09a39a3502e0f7b7fff77d66184fa75f363ba2fb1e0cc0ce25e8b64bc58d317293f11f7e1b0cfde3403924d0fe39c3a"

RPROVIDES:${PN} += "/sbin/service \
aaa-base \
config-aaa-base"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/date \
/usr/bin/grep \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/tput \
/usr/bin/xz \
distribution-release \
filesystem \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
