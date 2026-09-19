SUMMARY = "Various test binaries for the Linux Kernel Library (LKL)"
DESCRIPTION = "Boot, network and disk I/O test binaries for the Linux Kernel Library (LKL). \
 \
WARNING: LKL is EXPERIMENTAL; using it could cause data corruption!"
LICENSE = "GPL-2.0-only"

PV = "0.6.4+git.4863.9c68545add5d"

RPM_NAME = "lkl-test-0.6.4+git.4863.9c68545add5d-2.1.aarch64.rpm"
RPM_HASH = "8aec9ff9cbcb59e040c7c384102685b329082d929705cb9ef95858a3c2b07e8f8c7bec9ccd6b9bb012c1e6ba849cdc0a036e27a3fd6a9bd25e5874d643d416b9"

RPROVIDES:${PN} += "lkl-test"

RDEPENDS:${PN} += "libarchive.so.13 \
libc.so.6"

inherit rpm
