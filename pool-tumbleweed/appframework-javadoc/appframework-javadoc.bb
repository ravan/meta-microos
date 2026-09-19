SUMMARY = "Swing Application Framework"
DESCRIPTION = "The JSR-296 Swing Application Framework prototype implementation is a \
small set of Java classes that simplify building desktop applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "appframework-javadoc-1.03-29.10.noarch.rpm"
RPM_HASH = "83511b60215bcfe1c77f9f40d5277bc86f6ab05498249047fdda593a380409940236a3fd4b915b2aed9563505c0b6236bf79ea055d3bc97f56156328e569cd88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appframework-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
