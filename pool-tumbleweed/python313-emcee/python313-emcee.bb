SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.6"

RPM_NAME = "python313-emcee-3.1.6-2.5.noarch.rpm"
RPM_HASH = "ee793198440d2bedcf0518f781e5b254ff69a2b2d2a51ad8dd6b6697b334dce63e701066fc8b6f9d579f7e80031029ee301185a6bae7f246be0384b40dad6a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emcee \
python3.13dist-emcee \
python313-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python313-h5py \
python313-numpy \
python313-scipy"

inherit rpm
