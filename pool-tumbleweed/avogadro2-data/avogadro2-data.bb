SUMMARY = "Data files for Avogadro2 and Avogadro2libs"
DESCRIPTION = "This package contains: \
  * Crystallographic files of common materials, elements, oxides, for visualization in Avogadro. \
  * Common molecule fragments for visualization in Avogadro"
LICENSE = "Apache-2.0 & BSD-3-Clause & CDDL-1.0 & GPL-3.0-or-later"

PV = "1.100.0"

RPM_NAME = "avogadro2-data-1.100.0-3.6.noarch.rpm"
RPM_HASH = "c3e0aaee4aaaf5850a4d16796733734623982158ccf4ef32501da1936b9c757ba4d68588edc820add9451adb41a566db13c8320cc92f44f262559c744c027d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avogadro2-data"

RDEPENDS:${PN} += ""

inherit rpm
