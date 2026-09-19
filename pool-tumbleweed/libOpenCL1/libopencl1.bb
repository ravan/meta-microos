SUMMARY = "OpenCL ICD Bindings"
DESCRIPTION = "OpenCL is a royalty-free standard for cross-platform, parallel programming \
of modern processors found in personal computers, servers and \
handheld/embedded devices. \
 \
This package provides an Installable Client Driver Bindings (ICD Bindings). \
The provided libOpenCL library is able to load any free or non-free installed \
ICD (driver backend)."
LICENSE = "BSD-2-Clause"

PV = "2.3.4"

RPM_NAME = "libOpenCL1-2.3.4-1.5.aarch64.rpm"
RPM_HASH = "eb2e928f39634bb5e3033734f11537ee57211cc87f226ad415b37c27719b1dd88cd18a6bb15e9a1b3a542d739454fa042c01ed8d489e943e8d7b3c7f57de1d09"

RPROVIDES:${PN} += "libOpenCL.so.1 \
libOpenCL1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
