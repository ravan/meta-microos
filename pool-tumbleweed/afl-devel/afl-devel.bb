SUMMARY = "Development headers for use when fuzzing with American fuzzy lop"
DESCRIPTION = "This package contains include files for use with afl."
LICENSE = "AGPL-3.0-or-later & Apache-2.0"

PV = "5.03c"

RPM_NAME = "afl-devel-5.03c-1.1.aarch64.rpm"
RPM_HASH = "67f0dd708e95fdcf70b370836f26fadc3070f0cb1e69438f5196f6aa3370b9972c13f2f6ddf0e29030a754e1c19839cbd7f29818e96e76e322182fc127fb9ad5"

RPROVIDES:${PN} += "afl-devel"

RDEPENDS:${PN} += "afl"

inherit rpm
