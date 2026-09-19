SUMMARY = "Library to parse the cdrecord config file"
DESCRIPTION = "This library implements a mechanism to read the settings from \
cdrecord's config file(s)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libcdrdeflt1_0-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "6807863451656bd83ba0b17d9d47405260b844b6b41adcba2fca02c568def564880cb1e332018bc0de3059bb6ea7293f56765d8d8b70e52d1577c1dada244e40"

RPROVIDES:${PN} += "libcdrdeflt.so.1.0 \
libcdrdeflt1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libschily.so.2.0"

inherit rpm
