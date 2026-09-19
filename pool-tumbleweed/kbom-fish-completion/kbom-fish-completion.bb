SUMMARY = "Fish Completion for kbom"
DESCRIPTION = "Fish command line completion support for kbom."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "kbom-fish-completion-0.3.4-1.4.noarch.rpm"
RPM_HASH = "6d9bd6195977077c7b03093b0d18bd6acba9447d73210c36c7bfb895f87ea272e71f28b36cdd70971e394d52fecd0919571777c35937320dfe65e2f04bd6fdfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbom-fish-completion"

RDEPENDS:${PN} += "kbom"

inherit rpm
