SUMMARY = "Cppreference documentation for offline reading"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference."
LICENSE = "CC-BY-SA-3.0"

PV = "20250209"

RPM_NAME = "cppreference-doc-20250209-2.6.noarch.rpm"
RPM_HASH = "a75de4ebb72bc921577faf15b2c312a0badb80c5fdd36e2881775e0223679e4838eba718aaf874c4c557f298d4deaa0c99972f866733aed5065278ab502ca449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc"

RDEPENDS:${PN} += ""

inherit rpm
