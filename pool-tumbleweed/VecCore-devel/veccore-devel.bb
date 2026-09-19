SUMMARY = "Headers and cmake modules for VecCore"
DESCRIPTION = "VecCore is a simple abstraction layer on top of other vectorization libraries. \
 \
This package provides the headers and cmake modules for VecCore."
LICENSE = "Apache-2.0"

PV = "0.8.2"

RPM_NAME = "VecCore-devel-0.8.2-2.4.aarch64.rpm"
RPM_HASH = "7fb8e49b650d3ebf98d9fef08a685f97bb26daea36ffab14d655fdacb028649d0ac010b6d8e148fabbb2ac8486c4f9d3083dc108161e1af1abe0fe0e098df854"

RPROVIDES:${PN} += "VecCore-devel \
cmake-VecCore"

RDEPENDS:${PN} += ""

inherit rpm
