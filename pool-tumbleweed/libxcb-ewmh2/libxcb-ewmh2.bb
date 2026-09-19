SUMMARY = "XCB utility module for client- and WM-side ICCCM helpers"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- icccm: Both client and window-manager helpers for ICCCM."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "libxcb-ewmh2-0.4.2-1.12.aarch64.rpm"
RPM_HASH = "bb77fd595f1c99b42c8d86d2e4944aaa94a91f8c0d43b7ab9e02e12cd2a77da30fa7d564167745c74db99bf2f0157891f787f7494b7c2d9be98e16aa83b808cf"

RPROVIDES:${PN} += "libxcb-ewmh.so.2 \
libxcb-ewmh2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
