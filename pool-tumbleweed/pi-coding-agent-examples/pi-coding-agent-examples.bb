SUMMARY = "Example extensions for pi-coding-agent"
DESCRIPTION = "Example pi extensions, skills and prompt templates, read by the /examples \
command of pi-coding-agent."
LICENSE = "0BSD & Apache-2.0 & BSD-3-Clause & BlueOak-1.0.0 & ISC & MIT & Unlicense"

PV = "0.85.1"

RPM_NAME = "pi-coding-agent-examples-0.85.1-1.1.noarch.rpm"
RPM_HASH = "7151a2d99644464deb3d0c9eb5b5b27540178a17b0f1dd828662b22cdf4fc3ff218ea165c0b0bdab5cfcaeae25c249825263479c021474bcf42f9a69bf1c48d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pi-coding-agent-examples"

RDEPENDS:${PN} += "pi-coding-agent"

inherit rpm
