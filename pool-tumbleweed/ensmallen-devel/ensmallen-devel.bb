SUMMARY = "Math optimization C++ library"
DESCRIPTION = "ensmallen provides a set of abstractions for writing an objective \
function to optimize. It also provides a set of standard and \
optimizers that can be used for mathematical optimization tasks. \
These include full-batch gradient descent techniques, small-batch \
techniques, gradient-free optimizers, and constrained optimization."
LICENSE = "BSD-3-Clause & MPL-2.0 & BSL-1.0"

PV = "3.11.0"

RPM_NAME = "ensmallen-devel-3.11.0-1.2.aarch64.rpm"
RPM_HASH = "1c49da697d9638357340ed3225e8080dd928a42c9ee37e850cf4aa9cc41ac36d526c130d3d4aa97cee62e37faf6a5850500f41b089efc0116cd135c1c18c7c0e"

RPROVIDES:${PN} += "cmake-ensmallen \
ensmallen-devel"

RDEPENDS:${PN} += ""

inherit rpm
