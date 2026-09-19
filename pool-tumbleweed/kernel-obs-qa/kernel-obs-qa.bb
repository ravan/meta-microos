SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-obs-qa-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "faf3317426461170a260946f8792083c3376c90bb6cfad645a208e8dd62d213b8c26d6fd1b58136c8fb4815e84f74de5cb5089b6779b262ba097a0cdf8450d66"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm
