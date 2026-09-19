SUMMARY = "Tooling for the Java Module System"
DESCRIPTION = "The ModiTect project aims at providing productivity tools for working with the \
Java module system ('Jigsaw'). \
 \
Currently the following tasks are supported: \
• Generating module-info.java descriptors for given artifacts (Maven \
  dependencies or local JAR files) \
• Adding module descriptors to your project's JAR as well as existing JAR files \
  (dependencies) \
• Creating module runtime images \
 \
Compared to authoring module descriptors by hand, using ModiTect saves you work \
by defining dependence clauses based on your project's dependencies, describing \
exported and opened packages with patterns (instead of listing all packages \
separately), auto-detecting service usages and more. You also can use ModiTect \
to add a module descriptor to your project JAR while staying on Java 8 with \
your own build. \
 \
In future versions functionality may be added to work with other tools like \
jmod etc. under Maven and other dependency management tools in a comfortable \
manner."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "moditect-1.3.0-1.5.noarch.rpm"
RPM_HASH = "dd6978a69f05acf22158795ccdb6a72ebab23697e1bbd819e2ad4501f7cbf4e42805385909058f1109136fd98d3e86a94376598f440ee6b82917384855a84ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moditect \
mvn-org.moditect-moditect \
mvn-org.moditect-moditect-aggregator-pom- \
mvn-org.moditect-moditect-maven-plugin \
mvn-org.moditect-moditect-maven-plugin-pom- \
mvn-org.moditect-moditect-parent-pom- \
mvn-org.moditect-moditect-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.beust-jcommander \
mvn-com.github.javaparser-javaparser-core \
mvn-org.apache.maven-maven-archiver \
mvn-org.eclipse.aether-aether-util \
mvn-org.ow2.asm-asm"

inherit rpm
