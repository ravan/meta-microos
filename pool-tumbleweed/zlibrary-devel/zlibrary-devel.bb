SUMMARY = "Development files for zlibrary"
DESCRIPTION = "This package contains the libraries amd header files that are needed \
for writing applications with Zlibrary."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4"

RPM_NAME = "zlibrary-devel-0.99.4-5.4.aarch64.rpm"
RPM_HASH = "1bb94df3b1691323f0c2874261d9249918f68672a1d7c95d3f8f7899e20544b1d5c0940a7bfb3f1e66c05e82c235f8815f57807ff10e4ed48814923ded8f306a"

RPROVIDES:${PN} += "zlibrary-devel"

RDEPENDS:${PN} += "libzlui0-99 \
zlibrary0-99"

inherit rpm
