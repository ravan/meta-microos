SUMMARY = "Example for lcov"
DESCRIPTION = "Example sources for lcov"
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "lcov-example-2.4-1.3.noarch.rpm"
RPM_HASH = "e2b0ffcef0b8ccd65a93fc9cbb9bbf135a5e7e37cac7dbf300d0d4e91c86388cdf40e390eacdaef66e1089f0181b0b42983cefb9f72082825d86acc09a046d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lcov-example"

RDEPENDS:${PN} += "lcov"

inherit rpm
