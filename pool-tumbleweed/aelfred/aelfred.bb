SUMMARY = "Java-based XML parser"
DESCRIPTION = "AElfred is a Java-based XML parser from Microstar Software Ltd. AElfred \
is distributed for free (with full source) for both commercial and \
non-commercial use."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "aelfred-7.0-10.9.noarch.rpm"
RPM_HASH = "ae7b8c9af9208f265f4410dfc728e834824505445825a1a27b2bc0d013d79581c76ea1c3b3054d7712adb798e2543e45cfac1538b0baca70f29daea377a7defc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aelfred"

RDEPENDS:${PN} += ""

inherit rpm
