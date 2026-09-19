SUMMARY = "Hyper optimized contraction trees for large tensor networks and einsums"
DESCRIPTION = "A python library for contracting tensor networks or einsum expressions involving large numbers of tensors. \
Some of the key feautures of cotengra include: \
 * drop-in einsum replacement \
 * an explicit contraction tree object that can be flexibly built, modified and visualized \
 * a 'hyper optimizer' that samples trees while tuning the generating meta-paremeters \
 * dynamic slicing for massive memory savings and parallelism \
 * support for hyper edge tensor networks and thus arbitrary einsum equations \
 * paths that can be supplied to numpy.einsum, opt_einsum, quimb among others \
 * performing contractions with tensors from many libraries via cotengra, even if they don't provide einsum \
   or tensordot but do have (batch) matrix multiplication"
LICENSE = "Apache-2.0"

PV = "0.8.2"

RPM_NAME = "python313-cotengra-0.8.2-1.1.noarch.rpm"
RPM_HASH = "a58ed8f91dda9c5bbdcd2b3cae4286cf402372181329bca39eaf0a01f84048cd8426e6a4f7775988815ddb8f69c43a66045417b04d7bb5bb4a99c860a9d5a5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cotengra \
python3.13dist-cotengra \
python313-cotengra \
python3dist-cotengra"

RDEPENDS:${PN} += "python-abi \
python313-autoray"

inherit rpm
