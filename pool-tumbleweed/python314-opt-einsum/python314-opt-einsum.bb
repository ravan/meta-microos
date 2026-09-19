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

RPM_NAME = "python314-opt-einsum-3.3.0-3.11.noarch.rpm"
RPM_HASH = "b221c674be1ec9ed17ea664e6ae1c616b17598c46d2305ec02bda8ead035fc6c8249ed0894ef633d3fdab0f18fef5abaff6968adf6a5a3e1a435d01ca9933b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opt-einsum \
python314-opt-einsum \
python3dist-opt-einsum"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
