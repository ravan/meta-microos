SUMMARY = "Fancy kubectl"
DESCRIPTION = "Reduces repetitive interactions with kubectl"
LICENSE = "Apache-2.0"

PV = "0.0.1~alpha.1687425183.3950b1e"

RPM_NAME = "fubectl-0.0.1~alpha.1687425183.3950b1e-1.9.noarch.rpm"
RPM_HASH = "8eb6e23d76ebfc5957594d4f97d91df14329fc5a243edddb3813c9c28ec5616a8aec2601163ac4d70c3343624de6bc0c33a894bc5a4b5e9c32cc339bd204170a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fubectl"

RDEPENDS:${PN} += "fzf \
jq \
kubectl-neat \
kubectl-tree"

inherit rpm
