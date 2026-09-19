SUMMARY = "Fish Completion for buildpacks-cli"
DESCRIPTION = "Fish command line completion support for buildpacks-cli."
LICENSE = "Apache-2.0"

PV = "0.40.9"

RPM_NAME = "buildpacks-cli-fish-completion-0.40.9-1.1.noarch.rpm"
RPM_HASH = "da7bf32d0754befc116ed535279c6e6ad755824ac62e9f481631210a973a24cc1968dcbd1cf4c9b5bd50b26b3ce1c60e873b46351c3dcef3fb9c77ddb748b0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildpacks-cli-fish-completion"

RDEPENDS:${PN} += "buildpacks-cli"

inherit rpm
