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

RPM_NAME = "python314-lazyarray-0.7.0-1.3.noarch.rpm"
RPM_HASH = "c2cf8d116d6147bc83b67717ea3c595bb085efea54d10b3c487a4a4bee9804670c43fe61edf3e23d2278896fef6388670cd0b45b411f89acc13b3c0f90fbe7a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazyarray \
python314-lazyarray \
python3dist-lazyarray"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
