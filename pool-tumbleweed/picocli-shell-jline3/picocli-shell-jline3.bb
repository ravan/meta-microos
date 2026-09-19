SUMMARY = "Picocli Shell JLine3"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency. \
 \
Library to build interactive shell applications with JLine 3 and picocli."
LICENSE = "Apache-2.0"

PV = "4.7.7"

RPM_NAME = "picocli-shell-jline3-4.7.7-1.3.noarch.rpm"
RPM_HASH = "58735f466d3ae29a699b5af6bd5010f2d17905fc690b2bc082ed28f5ccdae8d810237bbd1e04f1df7401bb8bb57954fba2aa2a0b2353d6265c02b69dee4a6cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli-shell-jline3 \
mvn-info.picocli-picocli-shell-jline3-pom- \
picocli-shell-jline3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli \
mvn-org.jline-jline"

inherit rpm
