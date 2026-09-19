SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python39-emcee-3.1.4-1.5.noarch.rpm"
RPM_HASH = "d85e5308c7cda35a7aaada441dc95333d3e7c1df2982a93d3632bfdc8d489c8522f9b5108fb154adec89f25db8b51cde40bbfb3733a702ac7e0f8c3678ea82c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-emcee \
python39-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python39-h5py \
python39-numpy \
python39-scipy"

inherit rpm
