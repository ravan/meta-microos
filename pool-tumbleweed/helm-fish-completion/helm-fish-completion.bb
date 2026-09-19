SUMMARY = "Fish Completion for helm"
DESCRIPTION = "Fish command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "4.2.4"

RPM_NAME = "helm-fish-completion-4.2.4-3.1.noarch.rpm"
RPM_HASH = "61e4a23a56b5aaf2face6c42bdf14b2c7df71e002ceb41a02b7e51dcdcaf40eb74b6833170680b85c60b575ca09cb6ea7d1301aa2bef8bc829c5f9df536bf65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-fish-completion"

RDEPENDS:${PN} += "fish \
helm"

inherit rpm
