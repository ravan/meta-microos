SUMMARY = "Fish Completion for kube-review"
DESCRIPTION = "Fish command line completion support for kube-review."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "kube-review-fish-completion-0.5.0-1.9.noarch.rpm"
RPM_HASH = "fa21303684fa05bded552421a945d0a97c9e6c4811f3552607d35106db762081af92d538e342268bcb1359c90d4e06731ff2ccd1059325fb04208c2005fbfc1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kube-review-fish-completion"

RDEPENDS:${PN} += "kube-review"

inherit rpm
