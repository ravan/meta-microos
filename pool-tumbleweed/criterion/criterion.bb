SUMMARY = "A dead-simple, yet extensible, C and C++ unit testing framework"
DESCRIPTION = "Criterion follows the KISS principle, while keeping the control the user would have with other frameworks: \
* C99 and C++11 compatible. \
* Tests are automatically registered when declared. \
* Implements a xUnit framework structure. \
* A default entry point is provided, no need to declare a main unless you want to do special handling. \
* Test are isolated in their own process, crashes and signals can be reported and tested. \
* Unified interface between C and C++: include the criterion header and it just works. \
* Supports parameterized tests and theories. \
* Progress and statistics can be followed in real time with report hooks. \
* TAP output format can be enabled with an option. \
* Runs on Linux, FreeBSD, macOS, and Windows (Compiling with MinGW GCC and Visual Studio 2015+)."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "criterion-2.4.3-1.5.aarch64.rpm"
RPM_HASH = "1b1e23628942482b2b1388343fdd60ca132709caa948b6d4f161624d0b0149277ae144fedd81688eb378520d37d83ae6f2461bdc09dd08dfaf4558383806b46f"

RPROVIDES:${PN} += "criterion"

RDEPENDS:${PN} += ""

inherit rpm
