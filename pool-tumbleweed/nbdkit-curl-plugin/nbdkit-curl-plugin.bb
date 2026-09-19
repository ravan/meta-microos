SUMMARY = "HTTP/FTP (cURL) plugin for nbdkit"
DESCRIPTION = "This package contains cURL (HTTP/FTP) support for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-curl-plugin-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "b50129e12982d6f0138ce7f2e50bce2eba7d9481e7492f5b06e207ec8c5d977fee6581655ea952aca9bc00c35f23c03c56a51419d3914e2ec56632b2dec65942"

RPROVIDES:${PN} += "nbdkit-curl-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
nbdkit-server"

inherit rpm
