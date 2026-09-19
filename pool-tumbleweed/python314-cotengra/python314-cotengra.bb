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

RPM_NAME = "python314-cotengra-0.8.2-1.1.noarch.rpm"
RPM_HASH = "8b21a3527b034e2fea0e26161550a47099be2dd1c310091c4acb565bc0186a0da889e7ecd6a59fe78697ac3cf67cf6e5ce94f1037555be6a4263587c9c8b5639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cotengra \
python314-cotengra \
python3dist-cotengra"

RDEPENDS:${PN} += "python-abi \
python314-autoray"

inherit rpm
