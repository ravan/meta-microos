SUMMARY = "Russian ispell dictionary"
DESCRIPTION = "This package includes a ready Russian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "SUSE-Permissive"

PV = "1.5"

RPM_NAME = "ispell-russian-1.5-426.1.aarch64.rpm"
RPM_HASH = "2db41d1be774a6c966ca2a5f187325adb1c891460370cd6573f685572bc6bf632e5c675ebe649e19058b4ca696f07f7adb96e134393be12d3bc91888f850be84"

RPROVIDES:${PN} += "irussian \
ispell-dictionary \
ispell-russian \
locale-ispell-ru"

RDEPENDS:${PN} += ""

inherit rpm
