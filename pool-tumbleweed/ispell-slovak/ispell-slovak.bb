SUMMARY = "Slovak Ispell Dictionary"
DESCRIPTION = "This packages includes a ready Slovak dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the packages ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0+ | LGPL-2.1+ | MPL-1.1"

PV = "0.3.2"

RPM_NAME = "ispell-slovak-0.3.2-147.7.noarch.rpm"
RPM_HASH = "038b64a7e1a3a6064742a58a6367fdb59be6013ad2f9b9a6fe3424ba6d1ead71c843fbcc2f4c5da8b9ceb8cb18a0debcf3a294cef3cf7747005682714597b5ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-slovak \
locale-ispell-sk"

RDEPENDS:${PN} += ""

inherit rpm
