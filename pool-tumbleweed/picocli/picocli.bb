SUMMARY = "Tiny Command Line Interface"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency."
LICENSE = "Apache-2.0"

PV = "4.7.7"

RPM_NAME = "picocli-4.7.7-1.3.noarch.rpm"
RPM_HASH = "106433d70a16f0f14f109ca7acd4959c1f8f5e1af4879cf54376300052eb85ec535560725af2f213650f69a40800b842b0d85e8831768a650ab5dab84444ddd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli \
mvn-info.picocli-picocli-pom- \
osgi-picocli \
picocli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
