SUMMARY = "Development files for ntpsec"
DESCRIPTION = "This package contains libraries needed to develop application \
that use ntpsec."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "ntpsec-devel-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "040ce56c3878c08044362fa92b5d47f7d37cdf708e21b8c7c65597aca80ee43d651dd05310ec1ddb31d545ab7ca5af4c208df45bbe41fe1015c344fdf219c2d7"

RPROVIDES:${PN} += "ntpsec-devel"

RDEPENDS:${PN} += "libntpc1"

inherit rpm
