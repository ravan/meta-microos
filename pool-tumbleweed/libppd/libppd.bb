SUMMARY = "OpenPrinting libppd is a legacy support library for PPD files"
DESCRIPTION = "This package provides the libppd library, \
the legacy support library for PPD files, \
which is by 95% code overtaken from CUPS 2.x, \
only what is needed to handle PPD files \
(and also *.drv PPD generator files) \
for retro-fitting legacy printer drivers. \
As libppd is only for legacy PPD file support \
no new features will be add to it."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "libppd-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "cb9a5d8375ae9c95380ecfc4c6fcdd352f6df0394907a344b8060c215f517330752e842296b0ede9c25143ed4ebfc32ecc382fe3a0a101ba7bd4d652fd4c9382"

RPROVIDES:${PN} += "libppd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libppd.so.2"

inherit rpm
