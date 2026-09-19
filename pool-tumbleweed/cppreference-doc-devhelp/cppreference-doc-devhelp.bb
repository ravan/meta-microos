SUMMARY = "Cppreference documentation for offline reading - devhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the devhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20250209"

RPM_NAME = "cppreference-doc-devhelp-20250209-2.6.noarch.rpm"
RPM_HASH = "949fb906695181bb66c259325167fdf043f69f04e4d1153a3e9a0876cf5dc8bc56a7b0ab5582d7c97227d545aab76b84e4a25ef4556e231f19787b401e3ba18f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-devhelp"

RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
