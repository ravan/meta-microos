SUMMARY = "A much faster locate(1)"
DESCRIPTION = "plocate is a locate based on posting lists, completely replacing mlocate \
with a much faster (and smaller) index. It is suitable as a default locate \
on your system."
LICENSE = "GPL-2.0-only"

PV = "1.1.24"

RPM_NAME = "plocate-1.1.24-1.3.aarch64.rpm"
RPM_HASH = "a9527e187e97182f424e9562bed0b84c84f7b4e20b0962f69546428dd66f432846cdf56a1680be9583abf26a5c5eeae5b7e6a87db67c661c86328420c88b97ba"

RPROVIDES:${PN} += "config-plocate \
findutils-/usr/bin/locate \
findutils-locate \
mlocate \
plocate"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-nobody \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liburing.so.2 \
libzstd.so.1 \
systemd \
user-nobody"

inherit rpm
