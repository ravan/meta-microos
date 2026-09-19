SUMMARY = "Headers and sources for developing apps against testsweeper"
DESCRIPTION = "TestSweeper is a C++ testing framework for parameter sweeps. It handles parsing \
command line options, iterating over the test space, and printing results. This \
simplifies test functions by allowing them to concentrate on setting up and \
solving one problem at a time. \
 \
This package provides the headers and sources needed to develop apps against \
testsweeper."
LICENSE = "BSD-3-Clause"

PV = "2025.05.28"

RPM_NAME = "testsweeper-devel-2025.05.28-1.5.aarch64.rpm"
RPM_HASH = "6de1387ee398972b95e19e6a9e64d985b164bcab3eb53d976a9e797fdac0a92cffb671cc6664c32f03b1407ec1ee7c7829466f6cdfde8caf51bc2e34a5d8c6bd"

RPROVIDES:${PN} += "cmake-testsweeper \
testsweeper-devel"

RDEPENDS:${PN} += "libtestsweeper2"

inherit rpm
