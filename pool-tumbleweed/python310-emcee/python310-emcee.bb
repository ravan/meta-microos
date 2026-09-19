SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python310-emcee-3.1.4-1.5.noarch.rpm"
RPM_HASH = "922bdef3c2ecc062b5279ad396383e932ac4f2a2e12dbfdafdb36aa4e8b20e6f4b04e58f91ea2de35c37c044aaae5fd0796c2ec5f6d63f4ec33ba5a481d507b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-emcee \
python310-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python310-h5py \
python310-numpy \
python310-scipy"

inherit rpm
