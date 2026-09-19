SUMMARY = "Abseil library liblibabsl_city"
DESCRIPTION = "This package contains the libabsl_city library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_city2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "043c28f9c3995061852b318ed095a345fe75c09d82c595f98fc3e20522279618da0411d77e10854c06e45c7de893584027f67b84375fee85c4742fbab6e95bbb"

RPROVIDES:${PN} += "libabsl-city.so.2608.0.0 \
libabsl-city2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
