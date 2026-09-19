SUMMARY = "Fish Completion for kubefirst"
DESCRIPTION = "Fish command line completion support for kubefirst."
LICENSE = "MIT"

PV = "2.10.5"

RPM_NAME = "kubefirst-fish-completion-2.10.5-1.7.noarch.rpm"
RPM_HASH = "7903a4fb290e7fb4e56205255f2374bcd9107fcf26c4c2561b82533fdde13068c5a64348535343aabcdb2da14ce4b5e3e6737eedc9e080ea332f49afc057673d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubefirst-fish-completion"

RDEPENDS:${PN} += "kubefirst"

inherit rpm
