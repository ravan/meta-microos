SUMMARY = "C++ library to assist value-oriented design"
DESCRIPTION = "lager is a C++ library to assist value-oriented design by implementing the \
unidirectional data-flow architecture. It is heavily inspired by Elm and Redux, \
and enables composable designs by promoting the use of simple value types and \
testable application logic via pure functions."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "lager-devel-0.1.3-1.2.aarch64.rpm"
RPM_HASH = "349ed33787ace2629436018001a7913195444cd82c42c15906e2ac33e157ff9f5bbdf309ce0911c6410c1d57c4abe8a594d4e622967d5bb21a56e3c3597c4251"

RPROVIDES:${PN} += "cmake-Lager \
lager-devel"

RDEPENDS:${PN} += ""

inherit rpm
