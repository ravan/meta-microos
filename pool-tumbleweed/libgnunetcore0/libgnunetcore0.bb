SUMMARY = "GNUnet library libgnunetcore"
DESCRIPTION = "This package contains the libgnunetcore library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetcore0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "7b1816287412aefec71c2780b661873fd8e1254ad6d4be666fc70766377b52512a41fc1408a883fc2767978667a42df59b16fc759a7a096adcce2710d48d7e48"

RPROVIDES:${PN} += "libgnunetcore.so.0 \
libgnunetcore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
