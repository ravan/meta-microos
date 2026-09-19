SUMMARY = "Documentation of SVG Schemas"
DESCRIPTION = "SVG DTD and RELAX NG Schema Documentation in HTML"
LICENSE = "BSD-3-Clause"

PV = "20030114"

RPM_NAME = "svg-schema-doc-20030114-125.2.noarch.rpm"
RPM_HASH = "b1ffbab66e20aaef0c1c5c0487781f92587f417390bbea9955ddca206ae9d4ca622369c89c60737a464875721b37b9f93c1f6f8b46f7a7b8e199d27d911f2e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "svg-schema-doc"

RDEPENDS:${PN} += ""

inherit rpm
