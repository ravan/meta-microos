SUMMARY = "GDB testsuite results"
DESCRIPTION = "Results from running the GDB testsuite."
LICENSE = "SUSE-Public-Domain"

PV = "16.3"

RPM_NAME = "gdb-testresults-16.3-7.3.aarch64.rpm"
RPM_HASH = "244a8d76a5ac96869e6f77aab1a7f837ce3716f03bcac76eceabee070ea489d9aae64ea981851172a6921b92597cd561934396151d9e60c78cc5071c18ef5c86"

RPROVIDES:${PN} += "gdb-testresults"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
