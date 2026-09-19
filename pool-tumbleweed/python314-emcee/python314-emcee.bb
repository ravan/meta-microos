SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.6"

RPM_NAME = "python314-emcee-3.1.6-2.5.noarch.rpm"
RPM_HASH = "e9260c9c05e5a20bb8cecc72957da7766f3ae9c5a1720d4b13f2e9e9756546123a928045506f54f84242847fe7a24f5d5a55ed2bc9259500e82efc71f564178c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-emcee \
python314-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python314-h5py \
python314-numpy \
python314-scipy"

inherit rpm
