SUMMARY = "User-mode networking for unprivileged network namespaces"
DESCRIPTION = "slirp for network namespaces, without copying buffers across the namespaces."
LICENSE = "BSD-2-Clause & GPL-2.0-only & MIT"

PV = "1.3.4"

RPM_NAME = "slirp4netns-1.3.4-1.2.aarch64.rpm"
RPM_HASH = "4c824d64049887ff0dcd63458fcc818d394617b3c387e5e82dcbbb670e9f3b082c97f43d365cb6dec210641e855b75cc0bcddb53ad1388a2f79cef289c4ef98f"

RPROVIDES:${PN} += "slirp4netns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libseccomp.so.2 \
libslirp.so.0"

inherit rpm
