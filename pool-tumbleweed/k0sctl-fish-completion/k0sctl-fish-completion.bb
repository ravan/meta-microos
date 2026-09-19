SUMMARY = "Fish Completion for k0sctl"
DESCRIPTION = "Fish command line completion support for k0sctl."
LICENSE = "Apache-2.0"

PV = "0.32.2"

RPM_NAME = "k0sctl-fish-completion-0.32.2-1.1.noarch.rpm"
RPM_HASH = "b7cba0e2392818a9002a4bf9b271687e91c85e2b847a74df53bbf451d1bde14feca2dafc0d5adac852280f3cac14de4fd243a8395aade2e8a7d10eb03c4e6d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k0sctl-fish-completion"

RDEPENDS:${PN} += "k0sctl"

inherit rpm
