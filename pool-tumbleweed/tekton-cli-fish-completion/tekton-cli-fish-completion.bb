SUMMARY = "Fish Completion for tekton-cli"
DESCRIPTION = "Fish command line completion support for tekton-cli."
LICENSE = "Apache-2.0"

PV = "0.46.0"

RPM_NAME = "tekton-cli-fish-completion-0.46.0-1.1.noarch.rpm"
RPM_HASH = "331e5faa0a33b511c25f11f1ad9cb6e32ec74478ef18f2e661940c81f934126e1c96eec0d03f7f925ad860781708a5bcc3bbf3bbd0bba31e09485ead157c3f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tekton-cli-fish-completion"

RDEPENDS:${PN} += "tekton-cli"

inherit rpm
