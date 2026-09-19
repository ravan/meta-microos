SUMMARY = "GAP: Web Access via curl"
DESCRIPTION = "This package provides a wrapper around libcurl, to allow downloading \
files over http, ftp and https from within the GAP processor."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "gap-curlinterface-2.4.4-1.2.aarch64.rpm"
RPM_HASH = "6da93ffe8e148118c0982c51485e95add3176c83888bb0dcb304b1219c7eb27ef5d71799434732354a6a5d428a03ef463c2d3a397f93a0f69533738ed92d8305"

RPROVIDES:${PN} += "gap-curlinterface"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
