SUMMARY = "Headers for GNU SASL, an implementation of the SASL framework"
DESCRIPTION = "GNU SASL is an implementation of the Simple Authentication and \
Security Layer framework and a few common SASL mechanisms. SASL is \
used by network servers (e.g. IMAP, SMTP) to request authentication \
from clients, and in clients to authenticate against servers."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "gsasl-devel-2.2.4-1.2.aarch64.rpm"
RPM_HASH = "e88ca8d0da21eeceb8d1880510c53842e5d44ae2306f1ea5a1e0f9611d3a6055cb21ae31892afe93f43f790240d88f73d4d0abc99e9e72db77016765988c1760"

RPROVIDES:${PN} += "gsasl-devel \
libgsasl-devel \
pkgconfig-libgsasl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsasl18 \
pkgconfig-krb5-gssapi \
pkgconfig-libgcrypt \
pkgconfig-libidn"

inherit rpm
