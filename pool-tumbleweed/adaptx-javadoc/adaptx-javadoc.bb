SUMMARY = "Javadoc for adaptx"
DESCRIPTION = "This package contains the javadoc documentation for AdaptX."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-javadoc-0.9.13-137.10.noarch.rpm"
RPM_HASH = "e08dfcbdc4d89fdadc92826bffd88021cc2886509d6cb3233d431b110aebcb435629257fa6b22e3f220012edf96e36b0b4de527778389797bd3c0a7dec8baaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
