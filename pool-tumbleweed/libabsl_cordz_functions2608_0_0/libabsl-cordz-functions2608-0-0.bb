SUMMARY = "Abseil library liblibabsl_cordz_functions"
DESCRIPTION = "This package contains the libabsl_cordz_functions library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_cordz_functions2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "d96f0c1dc9cfc0e3445874e095fe3f4459403cf033466bd1162b61144016893a05b6855460071a5b09c1c4e71a6b4c4c3ef553e85168f245e35515fa636cee4a"

RPROVIDES:${PN} += "libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-functions2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-exponential-biased.so.2608.0.0"

inherit rpm
