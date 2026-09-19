SUMMARY = "Javadoc for jakarta-commons-beanutils"
DESCRIPTION = "The scope of the Jakarta Commons BeanUtils Package is to create a \
package of Java utility methods for accessing and modifying the \
properties of arbitrary JavaBeans.  No dependencies outside of the JDK \
are required, so the use of this package is very lightweight. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
BeanUtils Package."
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "apache-commons-beanutils-javadoc-1.11.0-3.6.noarch.rpm"
RPM_HASH = "278e77733a47e19a5753fb9b88b959b7c4229ea79e975befdd6bf005310611d9bd9e2ebb7ae926f254fad8475038575f9acedf584afb8375c379e2990123edcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-beanutils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
