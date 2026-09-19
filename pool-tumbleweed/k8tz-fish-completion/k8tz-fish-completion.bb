SUMMARY = "Fish Completion for k8tz"
DESCRIPTION = "Fish command line completion support for k8tz."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "k8tz-fish-completion-0.20.0-1.2.noarch.rpm"
RPM_HASH = "69e69398ffe3b0a4210ca49a5a97c601131b62772b67561ee43a474465a844f0b83d4d82ad4f14495b9a7fd40f118c75b50ce62c7435321fb826ee40098015ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8tz-fish-completion"

RDEPENDS:${PN} += "k8tz"

inherit rpm
