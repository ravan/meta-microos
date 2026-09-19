SUMMARY = "Fish Completion for helm3"
DESCRIPTION = "Fish command line completion support for helm3."
LICENSE = "Apache-2.0"

PV = "3.21.3"

RPM_NAME = "helm3-fish-completion-3.21.3-6.1.noarch.rpm"
RPM_HASH = "8b82e372b7d35b20dede2e064851af0ecfc4829e0a1919010d341938f4ed370388338b4649469189fbde8a02a148127e99a04869f6404c66c3e6703a4aa2bd68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm3-fish-completion"

RDEPENDS:${PN} += "fish \
helm3"

inherit rpm
