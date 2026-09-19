SUMMARY = "Component metadata from plexus-containers"
DESCRIPTION = "The Plexus project seeks to create end-to-end developer tools for \
writing applications. At the core is the container, which can be \
embedded or for a full scale application server. There are many \
reusable components for hibernate, form processing, jndi, i18n, \
velocity, etc. Plexus also includes an application server which \
is like a J2EE application server, without all the baggage."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.2.0"

RPM_NAME = "plexus-component-metadata-2.2.0-3.1.noarch.rpm"
RPM_HASH = "903170738bbe35924f1913d90c0b1fa686c7b421f14cd205d68f99ec549366661a5e78e5c4bc05d7c95336c4ada9953dc179cb4596e0bdeb61d41574d1b078f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-component-metadata \
mvn-org.codehaus.plexus-plexus-component-metadata-pom- \
plexus-component-metadata"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.jdom-jdom2 \
mvn-org.ow2.asm-asm"

inherit rpm
