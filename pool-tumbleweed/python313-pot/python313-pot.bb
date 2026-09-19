SUMMARY = "Python Optimal Transport Library"
DESCRIPTION = "POT: Python Optimal Transport, has the following main features: \
* A large set of differentiable solvers for optimal transport problems, including: \
  *  Exact linear OT, entropic and quadratic regularized OT, \
  *  Gromov-Wasserstein (GW) distances, Fused GW distances and variants of \
     quadratic OT, \
  *  Unbalanced and partial OT for different divergences, \
*  OT barycenters (Wasserstein and GW) for fixed and free support, \
*  Fast OT solvers in 1D, on the circle and between Gaussian Mixture Models (GMMs), \
*  Many ML related solvers, such as domain adaptation, optimal transport mapping \
   estimation, subspace learning, Graph Neural Networks (GNNs) layers. \
*  Several backends for easy use with Pytorch, Jax, Tensorflow, Numpy and Cupy arrays."
LICENSE = "MIT"

PV = "0.9.6.post1"

RPM_NAME = "python313-pot-0.9.6.post1-1.6.aarch64.rpm"
RPM_HASH = "809c01aad06f3395b06dafade4c840ec1a2af7062ed174188317b7050044639d8b02db13653bb2ff6722ab2e0870c4fcbb84f3251ea5985d1744dc6a1e79d166"

RPROVIDES:${PN} += "python3-pot \
python3.13dist-pot \
python313-pot \
python3dist-pot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy \
python313-scipy"

inherit rpm
