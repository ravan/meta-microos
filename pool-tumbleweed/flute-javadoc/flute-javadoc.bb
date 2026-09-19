SUMMARY = "Javadoc for flute"
DESCRIPTION = "Javadoc for flute."
LICENSE = "LGPL-2.1-or-later & W3C"

PV = "1.3.0"

RPM_NAME = "flute-javadoc-1.3.0-6.18.noarch.rpm"
RPM_HASH = "acfbedaf80a8c366ac59985b57f0603c8572cfed110bfd483e14716b77b0730b8b86081c07e95f26b5bf967177142d96496588ba4cffff51f9f47993afa794f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flute-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
