SUMMARY = "Documentation for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the HTML documentation."
LICENSE = "Unicode-3.0"

PV = "78.3"

RPM_NAME = "libicu-doc-78.3-1.3.aarch64.rpm"
RPM_HASH = "4194eccb55b8926d28a9d3c0db06b60937455df5856986cd85c75a982db71d91a778238a56f97eddbe3162e940e6eb365ce547ac2c0f8abbe31663acd2faffa0"

RPROVIDES:${PN} += "libicu-doc"

RDEPENDS:${PN} += ""

inherit rpm
