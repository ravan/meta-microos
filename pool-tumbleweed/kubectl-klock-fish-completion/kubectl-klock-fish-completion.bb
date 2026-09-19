SUMMARY = "Fish Completion for kubectl-klock"
DESCRIPTION = "Fish command line completion support for kubectl-klock."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC-BY-4.0 & CC0-1.0"

PV = "0.9.2"

RPM_NAME = "kubectl-klock-fish-completion-0.9.2-1.1.noarch.rpm"
RPM_HASH = "376362dc322298114250dd1871eee36c148de05001a61c79483705c4c7f187eb05b15b9811dfa0e2f076372ac7de97903011f33a5ff8dd2d9f2ddb3618d0e35d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-klock-fish-completion"

RDEPENDS:${PN} += "fish \
kubectl-klock"

inherit rpm
