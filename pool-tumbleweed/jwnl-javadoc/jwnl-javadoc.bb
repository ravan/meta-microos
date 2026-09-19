SUMMARY = "Javadoc for jwnl"
DESCRIPTION = "This package contains javadoc for jwnl."
LICENSE = "BSD-3-Clause"

PV = "1.4~rc3"

RPM_NAME = "jwnl-javadoc-1.4~rc3-2.20.noarch.rpm"
RPM_HASH = "b3b45b0d7b48e4694144a8d32836e4022c8de23995f0453adcf373936128f76341d4e50e760f5fe368b54893369f99af99e8448364c2fb335d56c279129609b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwnl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
