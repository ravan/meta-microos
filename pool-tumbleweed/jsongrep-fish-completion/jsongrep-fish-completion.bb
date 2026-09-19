SUMMARY = "Fish Completion for jsongrep"
DESCRIPTION = "Fish command line completion support for jsongrep."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "jsongrep-fish-completion-0.9.0-1.4.noarch.rpm"
RPM_HASH = "42fe3a3b876d7a02f57e88b6969ddb9d928eb45be94b3de93c2a7e8c67b4280e102471c3a86b7243bb50ff7c26a2a428f1c51204eb22087e1a00a0eb26aece83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsongrep-fish-completion"

RDEPENDS:${PN} += "fish \
jsongrep"

inherit rpm
