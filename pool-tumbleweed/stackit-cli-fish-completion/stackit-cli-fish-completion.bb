SUMMARY = "Fish Completion for stackit-cli"
DESCRIPTION = "Fish command line completion support for stackit-cli."
LICENSE = "Apache-2.0"

PV = "0.72.0"

RPM_NAME = "stackit-cli-fish-completion-0.72.0-1.1.noarch.rpm"
RPM_HASH = "0e854e2d00fb463b0ffc3b701cc502b2fbda6d585c60c768013c00d6959e69edf34e92c7eb4d41218be94b97e2b855cf230aa6342469314e08da5505b62adeba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stackit-cli-fish-completion"

RDEPENDS:${PN} += "fish \
stackit-cli"

inherit rpm
