SUMMARY = "A pam module to authenticated saslauthd as a provider"
DESCRIPTION = "A pam module that allows authentication to saslauthd as a provider. This only provides authentication \
not authorisation so you MUST not use this as a complete auth provider."
LICENSE = "MPL-2.0"

PV = "0.1.0~3"

RPM_NAME = "pam_saslauthd-0.1.0~3-2.12.aarch64.rpm"
RPM_HASH = "79c7fd8c0148e0128be01866553150c79a9f83a76d274617680056799e9fd357b6f01ea162558a709bfbcb4ec9c52624416d539c6a4f34041703d2e7031c3227"

RPROVIDES:${PN} += "bundled-rust-crate-libc \
bundled-rust-crate-pam-saslauthd \
bundled-rust-crate-pkg-config \
pam-saslauthd"

RDEPENDS:${PN} += "cyrus-sasl-saslauthd \
libc.so.6 \
libgcc-s.so.1 \
libpam.so.0"

inherit rpm
