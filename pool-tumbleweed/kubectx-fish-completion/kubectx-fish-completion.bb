SUMMARY = "Fish Completion for kubectx"
DESCRIPTION = "Fish command line completion support for kubectx."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubectx-fish-completion-0.11.0-1.5.noarch.rpm"
RPM_HASH = "8e512e14bee76448b8967e4828083fe0bc156f607e24d87cda881af378f467101f32c39a1f5fe07db4463798011a4b8e87a0d89c5e3a2a55617dc9c22f5ce9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectx-fish-completion"

RDEPENDS:${PN} += "fish \
kubectx"

inherit rpm
