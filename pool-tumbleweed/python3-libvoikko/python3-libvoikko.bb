SUMMARY = "Python interface to libvoikko"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a Python interface to libvoikko. This module \
can be used to perform various natural language analysis tasks on text."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.3"

RPM_NAME = "python3-libvoikko-4.3.3-1.5.noarch.rpm"
RPM_HASH = "517e4b98a0e786cdaafa4a7d17e5d01cb5fc2e7fbf36245f97968b77599af32f9f68030d67033c286ff24422adf3d582d62795258882b172c5e57885bbf625e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libvoikko"

RDEPENDS:${PN} += "libvoikko1 \
python-abi"

inherit rpm
