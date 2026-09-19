SUMMARY = "Fish Completion for clusterctl"
DESCRIPTION = "Fish command line completion support for clusterctl."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "clusterctl-fish-completion-1.14.0-1.1.noarch.rpm"
RPM_HASH = "13ac14e52e8b793f16c15d8a3e7bb86a6a522240c114ea87ddec08b81e6e311e23def0ec6cacd4030cda8148b276efef6e1165bc4950b1af0f072e0bd8da6dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusterctl-fish-completion"

RDEPENDS:${PN} += "clusterctl"

inherit rpm
