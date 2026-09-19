SUMMARY = "Signing tool for PE-COFF binaries"
DESCRIPTION = "Signing tool for PE-COFF binaries. It is vaguely compliant \
with the PE and Authenticode specifications."
LICENSE = "GPL-3.0-or-later"

PV = "116"

RPM_NAME = "pesign-116-11.2.aarch64.rpm"
RPM_HASH = "1940b2a82d06f1ebff0430406e65a62b1bb5d929331fede8aa4240d4938d053043b5ce0f9073c7e331e0f0b26ec0f523372ee41bf049a127c383dc49555eb623"

RPROVIDES:${PN} += "config-pesign \
group-pesign \
pesign \
rpm-macro--pesign \
rpm-macro--pesign-client \
rpm-macro-pesign \
user-pesign"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libefivar.so.1 \
libnspr4.so \
libnss3.so \
libpopt.so.0 \
libsmime3.so \
libuuid.so.1 \
mozilla-nss-tools \
sysuser-shadow"

inherit rpm
