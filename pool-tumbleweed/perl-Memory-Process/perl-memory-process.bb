SUMMARY = "Memory process reporting"
DESCRIPTION = "Memory process reporting."
LICENSE = "BSD-3-Clause"

PV = "0.60.0"

RPM_NAME = "perl-Memory-Process-0.60.0-1.6.noarch.rpm"
RPM_HASH = "7ef8fd7105755c5356c09b80023f6d78a013cef6ea4088fa5d03799b425b230c63078088cd7ff91c741248c914727f703384920b2c86b04e49bd4579d9ac65a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Memory--Process \
perl-Memory-Process"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Memory--Usage \
perl-Readonly"

inherit rpm
