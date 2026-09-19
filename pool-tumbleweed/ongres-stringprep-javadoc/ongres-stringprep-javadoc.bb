SUMMARY = "Javadoc for ongres-stringprep"
DESCRIPTION = "This package contains javadoc for ongres-stringprep"
LICENSE = "BSD-2-Clause"

PV = "2.2"

RPM_NAME = "ongres-stringprep-javadoc-2.2-5.4.noarch.rpm"
RPM_HASH = "e89c809ea6d642e69ddec2a20de2ed8dc2a4f9ac865bed58792d28356c02548fd5b2520c7637481256ceb632a66fa81612f46affe2f748adc19ae376c8a637b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ongres-stringprep-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
