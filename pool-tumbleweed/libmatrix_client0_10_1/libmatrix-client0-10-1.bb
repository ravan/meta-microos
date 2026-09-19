SUMMARY = "Client API library for Matrix, built on top of Boost.Asio"
DESCRIPTION = "Client API library for the Matrix protocol, built on top of Boost.Asio."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "libmatrix_client0_10_1-0.10.1-1.7.aarch64.rpm"
RPM_HASH = "1fcf83f53e51cdf5442e48e5d27a688e94cdec4228105c1a371406134e72cfcd96751def0856026a21acadf679010f8129f104565bbc9f4dd49e95e121149c3d"

RPROVIDES:${PN} += "libmatrix-client.so.0.10.1 \
libmatrix-client0-10-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcoeurl.so.0.3 \
libcrypto.so.3 \
libfmt.so.12 \
libgcc-s.so.1 \
libolm.so.3 \
libre2.so.11 \
libspdlog.so.1.17 \
libstdc++.so.6"

inherit rpm
