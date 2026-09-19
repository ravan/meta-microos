SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmimonitoring library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "libipmimonitoring6-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "b73f1024b08045ac4860b80930ee9d3f28226383f46c4a9ec46273a7b4e5daf1afcb968c2c03e646681cfb670fa79dc44918cdbbe02e9d59e6a6137a6cee6e0f"

RPROVIDES:${PN} += "libipmimonitoring.so.6 \
libipmimonitoring6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17"

inherit rpm
