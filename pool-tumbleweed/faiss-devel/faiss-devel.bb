SUMMARY = "Development headers for faiss"
DESCRIPTION = "These are the header for C and C++ of faiss"
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "faiss-devel-1.10.0-2.7.aarch64.rpm"
RPM_HASH = "3bdac5923122d531c19b87932281f0e7afdf64c4efb469127959de251dbbccc5cefbd3cae2c82151b97d4a897341e330376623def4491212e6425ff5946afdf1"

RPROVIDES:${PN} += "faiss-devel"

RDEPENDS:${PN} += "libfaiss"

inherit rpm
