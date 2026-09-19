SUMMARY = "SUSE Linux Base Package (malloc checking)"
DESCRIPTION = "This package sets environment variables that enable stricter \
malloc checks to catch potential heap corruptions. It's not \
installed by default as it may degrade performance."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20260610.3b5a868c"

RPM_NAME = "aaa_base-malloccheck-84.87+git20260610.3b5a868c-1.3.aarch64.rpm"
RPM_HASH = "7db801620630a489689cc5fb1811c7cf731bfe8ddae17e7417463375844b6fc2c5d61adc03d8f62cc6dc37de165f08fb6944bd271d8c191828377c4727f0f62b"

RPROVIDES:${PN} += "aaa-base-malloccheck"

RDEPENDS:${PN} += "aaa-base"

inherit rpm
