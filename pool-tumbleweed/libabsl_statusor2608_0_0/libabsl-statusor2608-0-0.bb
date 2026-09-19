SUMMARY = "Abseil library liblibabsl_statusor"
DESCRIPTION = "This package contains the libabsl_statusor library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_statusor2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "df4ad308d9592673690715503b1b612adbf96ec4fdcce78151d20e3c7f6ad51557658b12296510a62a7ce9a61a5712413b7186928104d4f1b3d7d5a0e8ab71d7"

RPROVIDES:${PN} += "libabsl-statusor.so.2608.0.0 \
libabsl-statusor2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
