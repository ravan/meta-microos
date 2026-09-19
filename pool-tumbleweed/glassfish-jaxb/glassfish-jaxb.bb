SUMMARY = "JAXB Reference Implementation"
DESCRIPTION = "GlassFish JAXB Reference Implementation."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-2.3.1-12.4.noarch.rpm"
RPM_HASH = "83a5fb0b19764241e2c4016b04bd8a45df483086fbba0e195979fa5110c2933305e1fa594f3518ca19ec1ec573b04e80f5106324bc5f55a5f56ebbef95b91619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb"

RDEPENDS:${PN} += "glassfish-jaxb-bom \
glassfish-jaxb-bom-ext \
glassfish-jaxb-codemodel \
glassfish-jaxb-codemodel-annotation-compiler \
glassfish-jaxb-codemodel-parent \
glassfish-jaxb-external-parent \
glassfish-jaxb-jxc \
glassfish-jaxb-parent \
glassfish-jaxb-relaxng-datatype \
glassfish-jaxb-rngom \
glassfish-jaxb-runtime \
glassfish-jaxb-runtime-parent \
glassfish-jaxb-txw-parent \
glassfish-jaxb-txw2 \
glassfish-jaxb-txwc2 \
glassfish-jaxb-xjc \
glassfish-jaxb-xsom \
java-headless"

inherit rpm
