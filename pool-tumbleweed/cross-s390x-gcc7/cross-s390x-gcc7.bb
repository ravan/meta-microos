SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "3816596606d0b93aa3f057260855a044beb6a5caec210e51ef586e03f77f13a8f484bfa62f33246d0bb757c28f093e06a5ba63cab162f3bab7604d0f6a8da1eb"

RPROVIDES:${PN} += "cross-s390x-gcc7 \
liblto-plugin.so.0 \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
