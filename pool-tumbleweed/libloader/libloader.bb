SUMMARY = "Resource Loading Framework"
DESCRIPTION = "LibLoader is a general purpose resource loading framework. It has been \
designed to allow to load resources from any physical location and to \
allow the processing of that content data in a generic way, totally \
transparent to the user of that library."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libloader-1.1.6-2.9.noarch.rpm"
RPM_HASH = "ee9373d0390adc3e1a622b1a7e695de87ccff607277d7bfa836fbac5eb91550a67dde256227003a4ee6275db0dccaa139abe2e7c90d5b9ad0db7c04eb39c339d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libloader"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm
