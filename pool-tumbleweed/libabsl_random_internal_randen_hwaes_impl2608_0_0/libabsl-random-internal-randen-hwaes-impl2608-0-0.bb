SUMMARY = "Abseil library liblibabsl_random_internal_randen_hwaes_impl"
DESCRIPTION = "This package contains the libabsl_random_internal_randen_hwaes_impl library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_randen_hwaes_impl2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "abec28a3859a6e94f2a3521460508c8de4637a2f96d9822d5c8a2a2b8413a10643c8fb074f40098675d485fb47d923da58b87b4861d0b3a926f9d52b44bea992"

RPROVIDES:${PN} += "libabsl-random-internal-randen-hwaes-impl.so.2608.0.0 \
libabsl-random-internal-randen-hwaes-impl2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
