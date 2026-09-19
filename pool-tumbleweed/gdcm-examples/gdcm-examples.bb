SUMMARY = "GDCM examples"
DESCRIPTION = "CSharp, C++, Java, PHP and Python example programs for GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "gdcm-examples-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "70932a011ee80421efd8a9798af87e444c79913cdef9313d4a4d3c89e32a3d5c6ed0c299b9b47df50daef31850dfa89f4bc3f6d64a915ef127e3ff12431c2142"

RPROVIDES:${PN} += "gdcm-examples"

RDEPENDS:${PN} += "libgdcm3-2"

inherit rpm
