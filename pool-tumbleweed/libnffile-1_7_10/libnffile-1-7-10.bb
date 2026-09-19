SUMMARY = "Shared Library part of libnffile"
DESCRIPTION = "Shared Library part of libnffile."
LICENSE = "BSD-3-Clause"

PV = "1.7.10"

RPM_NAME = "libnffile-1_7_10-1.7.10-1.1.aarch64.rpm"
RPM_HASH = "026e84ef627eeebba93355946c939972eee68ab06eebe33773e00bfc8fe1603847463f9450c55136e19552d9d242005da2c8840418dea2e282a6f6ec6121991f"

RPROVIDES:${PN} += "libnffile-1-7-10 \
libnffile-1.7.10.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1"

inherit rpm
