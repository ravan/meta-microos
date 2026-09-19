SUMMARY = "Wrapper for easing to port commands to transactional systems"
DESCRIPTION = "Generic wrapper for calling commands which need to run in transactional update transparently"
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "transactional-wrapper-0.0.1-2.1.noarch.rpm"
RPM_HASH = "b878efd2d1125a109e016921f45e1d0e96d7abe1410298b066177b4c7470d389737260cbb0ecb8aeb0c63c55d1667345d2345940c5cf55c02af1823e252e9171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transactional-wrapper"

RDEPENDS:${PN} += "/usr/bin/bash \
transactional-update"

inherit rpm
