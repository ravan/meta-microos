SUMMARY = "Examples for python313-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-doc-6.11.0-2.3.noarch.rpm"
RPM_HASH = "2d59170a657525685371d945b8842adfed29580ce27c9fad2aff1d291911efce597b2ee1fed1827398106c347a945f54585f49716f39ad8018b2cb8b460f2666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt6-doc \
python3-qt6-doc \
python313-PyQt6-doc \
python313-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
