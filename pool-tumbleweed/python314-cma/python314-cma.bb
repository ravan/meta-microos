SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "4.4.4"

RPM_NAME = "python314-cma-4.4.4-1.3.noarch.rpm"
RPM_HASH = "d65e28648e61944ba0184810060c2cbcbd4350b6c05b283ed613695b0c70aaa73ec3012b562887fa20a7522c7f3bb511a851010ba4932563cc15ffce1d784695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cma \
python314-cma \
python3dist-cma"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
