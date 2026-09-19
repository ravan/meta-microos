SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python311-emcee-3.1.4-1.5.noarch.rpm"
RPM_HASH = "049f9292a505525e51fa22879b5942216407ef615196714a3620dae386006e8614f949e6df6c21c196ca84781d3341c764824639116bbbebfd310f21524fb93c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emcee \
python3.11dist-emcee \
python311-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python311-h5py \
python311-numpy \
python311-scipy"

inherit rpm
