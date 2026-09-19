SUMMARY = "YAML parser and emitter for the Java programming language"
DESCRIPTION = "SnakeYAML features: \
    * a complete YAML 1.1 parser. In particular, \
      SnakeYAML can parse all examples from the specification. \
    * Unicode support including UTF-8/UTF-16 input/output. \
    * high-level API for serializing and deserializing \
      native Java objects. \
    * support for all types from the YAML types repository. \
    * relatively sensible error messages."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "snakeyaml-2.2-3.9.noarch.rpm"
RPM_HASH = "e7e92ab52c7413f018e912d8c99f46728f073b07011a3757ef2dc588541567d359b37bb5a9d52984a1c386edfbbb71f21a252b3ae3f15ab7b7b83f07f74d1955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.yaml-snakeyaml \
mvn-org.yaml-snakeyaml-pom- \
osgi-org.yaml.snakeyaml \
snakeyaml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec"

inherit rpm
