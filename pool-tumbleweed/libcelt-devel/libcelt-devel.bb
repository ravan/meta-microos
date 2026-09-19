SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "libcelt-devel-0.11.3-2.5.aarch64.rpm"
RPM_HASH = "32aeb9ed12194aa3c8425356889f4d76b13b2edad0cdf259b69398de85eafdaf3c8f7bb94b78f82665dada2b8dfe4409219e9784a034560829c3e1e4a4edb0b6"

RPROVIDES:${PN} += "libcelt-devel \
pkgconfig-celt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
celt \
glibc-devel \
libcelt0-2 \
pkg-config"

inherit rpm
