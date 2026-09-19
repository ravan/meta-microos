SUMMARY = "Abseil library liblibabsl_hash"
DESCRIPTION = "This package contains the libabsl_hash library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_hash2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "8d594177e03912e2862eac3b1a0bee5a2e2d16032df57345f0e64a9e5f1543531148627275b35cb7c00e72e37e983cecf47dfcaf5626c123e542cc79ebf25d9d"

RPROVIDES:${PN} += "libabsl-hash.so.2608.0.0 \
libabsl-hash2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-city.so.2608.0.0"

inherit rpm
