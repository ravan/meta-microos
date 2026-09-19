SUMMARY = "Fish Completion for caddy"
DESCRIPTION = "Fish shell completion script for caddy, generated during the build."
LICENSE = "Apache-2.0"

PV = "2.11.4"

RPM_NAME = "caddy-fish-completion-2.11.4-1.3.noarch.rpm"
RPM_HASH = "d873647e32edbce68ca112f4acdbe1313f663a9b94d64610750e2a1ce3a2b35509106dbe03de435bc3f938adea278139db45b12aaa494a42d8b166e9a15543cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caddy-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
