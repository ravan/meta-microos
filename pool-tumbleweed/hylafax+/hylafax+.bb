SUMMARY = "A fax server"
DESCRIPTION = "HylaFAX is a fax server supporting Class 1 and 2 fax modems on UNIX \
systems. It provides spooling services and numerous supporting fax \
management tools. The fax clients may reside on machines different \
from the server, and client implementations exist for a number of \
platforms, including Windows."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "hylafax+-7.0.11-2.4.aarch64.rpm"
RPM_HASH = "9f47454e6359492c50325783e42688c31c0acd732f8a0a698ca3da75b2bc442e7e8eceff73827fcc0f63f5daf4f73647117c8d42ba786b8490a3b0623670c896"

RPROVIDES:${PN} += "config-hylafax+ \
hylafax \
hylafax+ \
libfaxserver.so.7.0.11"

RDEPENDS:${PN} += "/usr/bin/sh \
gawk \
ghostscript \
ghostscript-fonts \
group-uucp \
hylafax+-client \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libfaxutil.so.7.0.11 \
libgcc-s.so.1 \
libjbig.so.2 \
liblcms2.so.2 \
libldap.so.2 \
libpam.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1 \
mailx \
sharutils \
systemd \
tiff \
user-uucp"

inherit rpm
