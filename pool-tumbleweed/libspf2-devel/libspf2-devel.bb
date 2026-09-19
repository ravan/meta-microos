SUMMARY = "Development files for libspf"
DESCRIPTION = "The libspf2-devel package contains the header files and static \
libraries necessary for developing programs using the libspf2 (Sender \
Policy Framework) library. \
 \
If you want to develop programs that will look up and process SPF records, \
you should install libspf2-devel. \
 \
API documentation is in the separate libspf2-apidocs package."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-devel-1.2.11-8.13.aarch64.rpm"
RPM_HASH = "2e98c439b17b24b11fd12ac9ed8267929a6736a93647359451fd687f9074905d12e3c17fb8b1f2fbd0b0877802c18c6b65ecd873543cc84bb48fcadeaf485c57"

RPROVIDES:${PN} += "libspf2-devel"

RDEPENDS:${PN} += "libspf2-2"

inherit rpm
