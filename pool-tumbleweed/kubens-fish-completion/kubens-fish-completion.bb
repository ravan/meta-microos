SUMMARY = "Fish Completion for kubens"
DESCRIPTION = "Fish command line completion support for kubens."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubens-fish-completion-0.11.0-2.3.noarch.rpm"
RPM_HASH = "5395db5686c8b211ec320f48ab5565ece09093238dd941c19770173114850fb0eb97cda61943a38eea451931fe560d79f07e69a2740bca83823742473513c12b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubens-fish-completion"

RDEPENDS:${PN} += "fish \
kubens"

inherit rpm
