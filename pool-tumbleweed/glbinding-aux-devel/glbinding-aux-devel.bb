SUMMARY = "Headers and objects for building against glbinding's auxiliary features"
DESCRIPTION = "glbinding is a C++ binding for the OpenGL API. \
 \
This package provides the headers and objects to build against glbinding's \
auxiliary features including logging, meta information, or debugging \
functionality."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "glbinding-aux-devel-3.5.0-2.5.aarch64.rpm"
RPM_HASH = "851f27d810f9953aae5a25c6df04e861f67e4b643493d043048db6a773647397edbf5c3793696cced909afa8071e437aa7b322aa2248c401d910321c5a6824ca"

RPROVIDES:${PN} += "glbinding-aux-devel"

RDEPENDS:${PN} += "glbinding-devel \
libglbinding-aux3 \
libglbinding3"

inherit rpm
