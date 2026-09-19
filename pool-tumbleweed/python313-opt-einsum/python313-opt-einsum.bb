SUMMARY = "Optimizing numpys einsum function"
DESCRIPTION = "Optimized einsum can significantly reduce the overall execution time of einsum-like expressions (e.g., \
`np.einsum`,`dask.array.einsum`,`pytorch.einsum`,`tensorflow.einsum`) \
by optimizing the expression's contraction order and dispatching many \
operations to canonical BLAS, cuBLAS, or other specialized routines. Optimized \
einsum is agnostic to the backend and can handle NumPy, Dask, PyTorch, \
Tensorflow, CuPy, Sparse, Theano, JAX, and Autograd arrays as well as potentially \
any library which conforms to a standard API. See the \
[**documentation**](http://optimized-einsum.readthedocs.io) for more \
information."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python313-opt-einsum-3.3.0-3.11.noarch.rpm"
RPM_HASH = "b901f8204068d01e86340b6a1b730aea07751ef440c5b1a3d5493c1a74673d399eef5a126503f1e20354f8d3034ec620177d92a043059a9565884361f6124164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opt-einsum \
python3.13dist-opt-einsum \
python313-opt-einsum \
python3dist-opt-einsum"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
