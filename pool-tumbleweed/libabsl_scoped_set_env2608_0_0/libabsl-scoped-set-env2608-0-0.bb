SUMMARY = "Abseil library liblibabsl_scoped_set_env"
DESCRIPTION = "This package contains the libabsl_scoped_set_env library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_scoped_set_env2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "0ab2420123cd3eb6e947ebe25b37b418d55d20b96f63dd32840fc83a4b048272178e0bdfd1914c42bcbba3e1f57e2e7aef6e37bcec429d93b5e275077c09ae78"

RPROVIDES:${PN} += "libabsl-scoped-set-env.so.2608.0.0 \
libabsl-scoped-set-env2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
