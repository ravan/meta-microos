SUMMARY = "Fish Completion for mesheryctl"
DESCRIPTION = "Fish command line completion support for mesheryctl."
LICENSE = "Apache-2.0"

PV = "1.0.65"

RPM_NAME = "mesheryctl-fish-completion-1.0.65-1.1.noarch.rpm"
RPM_HASH = "6af1e465c362dd77cdb24af6c6de906265e6aaae0f1d0eec3fbf60c88583f7654847c2a6641fb6b8d91c79372f49d2c7f0690312793c1c30c0134b93db506b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mesheryctl-fish-completion"

RDEPENDS:${PN} += "mesheryctl"

inherit rpm
