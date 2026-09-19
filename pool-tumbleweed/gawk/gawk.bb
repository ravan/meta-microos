SUMMARY = "Domain-specific language for text processing"
DESCRIPTION = "AWK is a domain-specific language designed for text processing and \
typically used as a data extraction and reporting tool. \
 \
GNU awk is upwardly compatible with the System V Release 4 awk.  It is \
almost completely POSIX 1003.2 compliant."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.1"

RPM_NAME = "gawk-5.4.1-1.2.aarch64.rpm"
RPM_HASH = "706a298a2844efc7800ff50e0043304ae0e74f3a565a013a8b09b9f0605fa935ee710aa5e19884d2b5270fde2c1bbd7706949b6c22a6b8231c639166dbb9c02f"

RPROVIDES:${PN} += "/usr/bin/awk \
/usr/bin/gawk \
awk \
config-gawk \
gawk"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libreadline.so.8"

inherit rpm
