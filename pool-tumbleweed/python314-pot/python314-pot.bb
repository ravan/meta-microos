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

RPM_NAME = "python314-pot-0.9.6.post1-1.6.aarch64.rpm"
RPM_HASH = "9ec54fe69cbc56726769a62e2d62f4d72e97de5d1e79fcd9952104586cccdcf56e31d337b3c89ae27757791d202f72d1d3b05efd2b7b80bb02714fb2da3d976f"

RPROVIDES:${PN} += "python3.14dist-pot \
python314-pot \
python3dist-pot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy \
python314-scipy"

inherit rpm
