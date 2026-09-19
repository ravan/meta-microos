SUMMARY = "Fish Completion for polaris"
DESCRIPTION = "Fish command line completion support for polaris."
LICENSE = "Apache-2.0"

PV = "10.2.2"

RPM_NAME = "polaris-fish-completion-10.2.2-1.1.noarch.rpm"
RPM_HASH = "2fdbe0212651d30a2cb818af93994da6158560ba357b857a676aa6854c83c49333fbeb5d90c8e576e7cd795f714d0e905d9301761e2d4c4f9d40e26d765bfbd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polaris-fish-completion"

RDEPENDS:${PN} += "polaris"

inherit rpm
