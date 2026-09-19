SUMMARY = "Cppreference documentation for offline reading - qhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the qhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20250209"

RPM_NAME = "cppreference-doc-qhelp-20250209-2.6.noarch.rpm"
RPM_HASH = "d3681a73e8d18a358fa7d9bcef07eac34be0f3cf4430878ed8f3936144143fd2c22b80d568bc311085bb79b44656489616947f73cf68e634c3a0e755790e5815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-qhelp"

RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
