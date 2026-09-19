SUMMARY = "Vc Static Library"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides the Vc static library."
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "Vc-devel-static-1.4.5-1.10.aarch64.rpm"
RPM_HASH = "31aec6319cbe00884b5f48801bac6f431d7c98293cb46d3ca7344466ad2743b449bbdcf83423da6cc4335dbccae47ff2f42eee7fa94cad22b5d71d6d61aa622b"

RPROVIDES:${PN} += "Vc-devel-static"

RDEPENDS:${PN} += "Vc-devel"

inherit rpm
