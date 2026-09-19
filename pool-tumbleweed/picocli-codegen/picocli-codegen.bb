SUMMARY = "Picocli Code Generation"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency. \
 \
Tools to generate documentation, configuration, source code and other files \
from a picocli model."
LICENSE = "Apache-2.0"

PV = "4.7.7"

RPM_NAME = "picocli-codegen-4.7.7-1.3.noarch.rpm"
RPM_HASH = "87c2654826394e4083ed9a41c1ec67d06a713827c441733188f59cab753c411b677dea8efaab37368b64d74eb8c817956d657032c5ae6d6e1ce88274a28bbea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli-codegen \
mvn-info.picocli-picocli-codegen-pom- \
picocli-codegen"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli"

inherit rpm
