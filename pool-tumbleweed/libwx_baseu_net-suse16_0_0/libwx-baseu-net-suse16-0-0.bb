SUMMARY = "wxWidgets networking library"
DESCRIPTION = "Classes for network access with wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_baseu_net-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "7434ff53eb6a8502017f6b63e2f6a56e3bc84f5734f175198434b2e6dda45659cbbbe14deefdeb687d27aecb8fcf8d1386e9ed484c2949193103824f6086e5e8"

RPROVIDES:${PN} += "libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-net-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0"

inherit rpm
