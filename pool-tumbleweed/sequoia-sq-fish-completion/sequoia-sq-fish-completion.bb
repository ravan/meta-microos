SUMMARY = "Fish Completion for sequoia-sq"
DESCRIPTION = "Fish command-line completion support for sequoia-sq."
LICENSE = "LGPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "sequoia-sq-fish-completion-1.4.0-4.1.noarch.rpm"
RPM_HASH = "ac0fda77b96a59fe4c49fc30de7dd4f064292a1a867f8b2bb98d2a5c3a5854d8c49e81dd539bf3358c22da622c0fcdb0bd38858cfd63ca8fbf4b9f841fe0e72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sequoia-sq-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
