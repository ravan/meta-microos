SUMMARY = "CLI Go test runner with output optimized for human readability"
DESCRIPTION = "Go test runner with output optimized for humans, JUnit XML for CI integration, \
and a summary of the test results."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "gotestsum-1.13.0-1.7.aarch64.rpm"
RPM_HASH = "9f1a932a2debc7e0c49a381259292eaf464969ed786743e3374d2129704a2f6c5f8d8a065f7062c22262d8d457d11a6794b44c94bd59567f5b819c27500270a9"

RPROVIDES:${PN} += "gotestsum"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
