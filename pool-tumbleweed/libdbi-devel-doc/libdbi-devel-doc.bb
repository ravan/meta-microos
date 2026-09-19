SUMMARY = "Development documentation for libdbi"
DESCRIPTION = "The libdbi-devel-doc package contains libdbi programmers-guide \
and driver-guide."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0.g33"

RPM_NAME = "libdbi-devel-doc-0.9.0.g33-4.19.noarch.rpm"
RPM_HASH = "b097cdf1c7a3484744b24afbc018487717ea4a3d35bbc1769d13b95e8783bccf5ccdda98d51f529e64d6eb2104afd24856cb0975c58d913f2339dea0fb1fbab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbi-devel-/usr/share/doc/packages/libdbi/driver-guide.pdf \
libdbi-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
