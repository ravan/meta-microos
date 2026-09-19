SUMMARY = "Includes static libraries for the ipmiutil package"
DESCRIPTION = "The ipmiutil-static package contains static libraries which are \
useful for building custom IPMI applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.2"

RPM_NAME = "ipmiutil-static-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "a6ff092a659a998083da95b4c81f052b9b9b8a4e1f69fa1e2c66e4445864e3e8b6a224b984450c898cea873b29261af270cfeda093c6eea985aed193539db74b"

RPROVIDES:${PN} += "ipmiutil-static"

RDEPENDS:${PN} += "ipmiutil"

inherit rpm
