SUMMARY = "Local mode for Apache Ivy (files)"
DESCRIPTION = "This package contains files needed by local mode fow Apache Ivy, which \
allows artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "javapackages-ivy-6.5.1-3.2.noarch.rpm"
RPM_HASH = "a2c958722f4c9a75e213645d471e52b332c6b772d828075a73f866ead990b9e4a7618ed438b280a9d2c64a11143297fe01a2b21c34605f0578dbd76ef786b42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapackages-ivy"

RDEPENDS:${PN} += "javapackages-local \
javapackages-tools"

inherit rpm
