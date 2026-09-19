SUMMARY = "ClamAV Milter compatible mail scanner"
DESCRIPTION = "ClamAV-milter is a filter for sendmail(1) mail server. It uses a \
mail scanning engine built into clamd(8). ClamAV-milter can use \
load balancing and fault tolerant techniques to connect to more \
than one clamd(8) server and seamlessly hot-swap to even the load \
between different machines and to keep scanning for viruses even \
when a server goes down."
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "clamav-milter-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "756e26cb554f5f3575aacee9d7cca12f3d1f649cd0ec5dd345ad994e579bb4436f2c63a0e64b48c32f5161d9cd584edb7210c9422a551762cce44a33c98d99b3"

RPROVIDES:${PN} += "clamav-/usr/sbin/clamav-milter \
clamav-milter \
config-clamav-milter"

RDEPENDS:${PN} += "/usr/bin/sh \
clamav \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclamav.so.12 \
libmilter.so.1.0"

inherit rpm
