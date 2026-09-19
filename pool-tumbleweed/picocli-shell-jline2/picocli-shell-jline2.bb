SUMMARY = "Picocli Shell JLine2"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency. \
 \
Library to build interactive shell applications with JLine 2 and picocli."
LICENSE = "Apache-2.0"

PV = "4.7.7"

RPM_NAME = "picocli-shell-jline2-4.7.7-1.3.noarch.rpm"
RPM_HASH = "a926a169effcf2bb0370e54cd47e999f9548430a3c622c7779ec1df657907a199cfe29009a201c23fff9cf461e4ac200b194346892bd6763f424330c67f9f560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli-shell-jline2 \
mvn-info.picocli-picocli-shell-jline2-pom- \
picocli-shell-jline2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli \
mvn-jline-jline"

inherit rpm
