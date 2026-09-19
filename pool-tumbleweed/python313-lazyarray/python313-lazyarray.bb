SUMMARY = "Lazily-evaluated numerical array class, compatible with NumPy arrays"
DESCRIPTION = "lazyarray is a Python package that provides a lazily-evaluated numerical array \
class, larray, based on and compatible with NumPy arrays. \
 \
Lazy evaluation means that any operations on the array (potentially including \
array construction) are not performed immediately, but are delayed until \
evaluation is specifically requested. Evaluation of only parts of the array is \
also possible. \
 \
Use of an larray`can potentially save considerable computation time \
and memory in cases where: \
 \
* arrays are used conditionally (i.e. there are cases in which the array is \
  never used) \
* only parts of an array are used (for example in distributed computation, \
  in which each MPI node operates on a subset of the elements of the array)"
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python313-lazyarray-0.7.0-1.3.noarch.rpm"
RPM_HASH = "9253bd805d630450da6f4556adaf39393d68f216a53ba8d1a0428440c6c0546d8f4347672f4f2bde7fcff86cd6f71bcdfd786448225d6f0384871c99c4c08508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazyarray \
python3.13dist-lazyarray \
python313-lazyarray \
python3dist-lazyarray"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
