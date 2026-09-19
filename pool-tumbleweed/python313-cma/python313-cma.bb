SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "4.4.4"

RPM_NAME = "python313-cma-4.4.4-1.3.noarch.rpm"
RPM_HASH = "50d2e2fa1f1ec45e193233556a4a881cca406a0cffd7e903f5b6ae3115f6a567fd04c1ec85488297c0d61378768037ad63dc66e61e102d3ab947980e530bdf71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cma \
python3.13dist-cma \
python313-cma \
python3dist-cma"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
