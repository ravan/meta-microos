SUMMARY = "COSMIC greeter for greetd"
DESCRIPTION = "libcosmic greeter for greetd, which can be run inside cosmic-comp"
LICENSE = "GPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "cosmic-greeter-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "e9c9b0d2452b4482ebaed36900016987641cd632b896ef8e9936501a4fb384f0f8aa464dd24c35d86fac5a9725cf136ef036789f6c2a8faaaab37f316d5096bc"

RPROVIDES:${PN} += "config-cosmic-greeter \
cosmic-greeter"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
cosmic-comp \
greetd \
libc.so.6 \
libdav1d.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libpam.so.0 \
libxkbcommon.so.0 \
mozilla-fira-fonts \
systemd \
sysuser-shadow"

inherit rpm
