SUMMARY = "Javadoc for libserializer"
DESCRIPTION = "Javadoc for libserializer."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.6"

RPM_NAME = "libserializer-javadoc-1.1.6-2.9.noarch.rpm"
RPM_HASH = "d99bbba0595d476a46d0c5226f8142d11c1f3ba4425955760aae0cb212d11bf34a2c8318f53204d1a515a8904dd937c5e6b4c97440724ccc937ae835b15f3cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libserializer-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
