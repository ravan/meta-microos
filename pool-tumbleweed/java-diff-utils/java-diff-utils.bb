SUMMARY = "A Java library for performing the comparison operations between texts"
DESCRIPTION = "Diff Utils library is an OpenSource library for performing the comparison \
operations between texts: computing diffs, applying patches, generating unified \
diffs or parsing them, generating diff output for easy future displaying (like \
side-by-side view) and so on. \
 \
Main reason to build this library was the lack of easy-to-use libraries with \
all the usual stuff you need while working with diff files. Originally it was \
inspired by JRCS library and it's nice design of diff module. \
 \
This is originally a fork of java-diff-utils from Google Code Archive."
LICENSE = "Apache-2.0"

PV = "4.12"

RPM_NAME = "java-diff-utils-4.12-1.10.noarch.rpm"
RPM_HASH = "9d4a2b071588b21db325ac4272446088ac59c860992e74d99f8e4ca92050ea8496ee96190392e27c92d3f935ab7acd20bafd1e0766b7475bb9e3dfc22b1c511a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-diff-utils \
mvn-io.github.java-diff-utils-java-diff-utils \
mvn-io.github.java-diff-utils-java-diff-utils-jgit \
mvn-io.github.java-diff-utils-java-diff-utils-jgit-pom- \
mvn-io.github.java-diff-utils-java-diff-utils-parent-pom- \
mvn-io.github.java-diff-utils-java-diff-utils-pom- \
osgi-io.github.java-diff-utils"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jgit-org.eclipse.jgit"

inherit rpm
