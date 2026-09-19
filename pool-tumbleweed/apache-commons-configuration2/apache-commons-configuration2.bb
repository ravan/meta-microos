SUMMARY = "Java library providing a generic Configuration interface"
DESCRIPTION = "The Commons Configuration library provides a generic Configuration \
interface which enables a Java application to read configuration data \
from a variety of sources. \
 \
Configuration parameters may be loaded from the following sources: \
 \
 * Properties files \
 * XML documents \
 * Windows INI files \
 * Property list files (plist) \
 * JNDI \
 * JDBC Datasource \
 * System properties \
 * Applet parameters \
 * Servlet parameters \
 \
Configuration objects are created using configuration builders. Different \
configuration sources can be mixed using a CombinedConfigurationBuilder and \
a CombinedConfiguration. Additional sources of configuration parameters \
can be created by using custom configuration objects. This customization \
can be achieved by extending AbstractConfiguration or \
AbstractHierarchicalConfiguration."
LICENSE = "Apache-2.0"

PV = "2.15.1"

RPM_NAME = "apache-commons-configuration2-2.15.1-1.2.noarch.rpm"
RPM_HASH = "96eaf23c581dc01aae2c407b616757f59bde722cfb3de3398b9c955741ea35c98bee975954ee8ef58aa3f04ff81dd6b6b923f3d86390520cddc4e6f3322a57bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-configuration2 \
mvn-org.apache.commons-commons-configuration2 \
mvn-org.apache.commons-commons-configuration2-pom- \
osgi-org.apache.commons.commons-configuration2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-commons-logging-commons-logging \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-text"

inherit rpm
