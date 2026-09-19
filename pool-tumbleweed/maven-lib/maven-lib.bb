SUMMARY = "Core part of Maven"
DESCRIPTION = "Core part of Apache Maven that can be used as a library."
LICENSE = "Apache-2.0 & MIT"

PV = "3.10.0~rc1"

RPM_NAME = "maven-lib-3.10.0~rc1-1.1.aarch64.rpm"
RPM_HASH = "c04212240267d2b72812bf9a9374d3423f0a97450b3458b19d8b08796f4e2e790222dd7b143d47d9fe775a4c8ed5d5d324b2b64c1844aef88a992d487a6a9844"

RPROVIDES:${PN} += "config-maven-lib \
maven-lib \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.apache.maven-maven-aether-provider-pom- \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-artifact-pom- \
mvn-org.apache.maven-maven-builder-support \
mvn-org.apache.maven-maven-builder-support-pom- \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-compat-pom- \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-core-pom- \
mvn-org.apache.maven-maven-embedder \
mvn-org.apache.maven-maven-embedder-pom- \
mvn-org.apache.maven-maven-jline \
mvn-org.apache.maven-maven-jline-pom- \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-model-builder \
mvn-org.apache.maven-maven-model-builder-pom- \
mvn-org.apache.maven-maven-model-pom- \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-plugin-api-pom- \
mvn-org.apache.maven-maven-pom- \
mvn-org.apache.maven-maven-repository-metadata \
mvn-org.apache.maven-maven-repository-metadata-pom- \
mvn-org.apache.maven-maven-resolver-provider \
mvn-org.apache.maven-maven-resolver-provider-pom- \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven-maven-settings-builder \
mvn-org.apache.maven-maven-settings-builder-pom- \
mvn-org.apache.maven-maven-settings-pom- \
mvn-org.apache.maven-maven-slf4j-provider \
mvn-org.apache.maven-maven-slf4j-provider-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
aopalliance \
apache-commons-cli \
apache-commons-codec \
apache-commons-logging \
atinject \
glassfish-annotation-api \
google-errorprone-annotations \
google-gson \
google-guice \
guava \
httpcomponents-client \
httpcomponents-core \
j2objc-annotations \
jakarta-inject \
java-headless \
javapackages-filesystem \
jcl-over-slf4j \
jline3-jansi-core \
jline3-native \
jline3-terminal \
jline3-terminal-jni \
jspecify \
maven-resolver-api \
maven-resolver-connector-basic \
maven-resolver-impl \
maven-resolver-named-locks \
maven-resolver-spi \
maven-resolver-supplier-mvn3 \
maven-resolver-transport-apache \
maven-resolver-transport-file \
maven-resolver-transport-wagon \
maven-resolver-util \
maven-wagon-file \
maven-wagon-http \
maven-wagon-http-shared \
maven-wagon-provider-api \
mvn-com.google.guava-failureaccess \
mvn-com.google.guava-guava \
mvn-com.google.inject-guice--classes- \
mvn-commons-cli-commons-cli \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-supplier-mvn3 \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-cipher \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-sec-dispatcher \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.jline-jansi-core \
mvn-org.jline-jline-terminal \
mvn-org.jline-jline-terminal-jni \
mvn-org.ow2.asm-asm \
mvn-org.slf4j-slf4j-api \
objectweb-asm \
plexus-cipher \
plexus-containers-component-annotations \
plexus-interpolation \
plexus-sec-dispatcher \
plexus-utils \
plexus-xml \
python3 \
sisu-inject \
sisu-plexus \
slf4j"

inherit rpm
