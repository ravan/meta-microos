SUMMARY = "Java command line arguments parser"
DESCRIPTION = "args4j is a small Java class library that makes it easy \
to parse command line options/arguments in your CUI application. \
- It makes the command line parsing very easy by using annotations \
- You can generate the usage screen very easily \
- You can generate HTML/XML that lists all options for your documentation \
- Fully supports localization \
- It is designed to parse javac like options (as opposed to GNU-style \
  where ls -lR is considered to have two options l and R)"
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-2.33-3.9.noarch.rpm"
RPM_HASH = "371de041f08f5468e699be85e7daffa61bc5a655981f384643d8b252b09980f7e6ba6b2e93bda97525098b6eebae5eaace19481a1085cbd911c20eb921dce9d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j \
mvn-args4j-args4j \
mvn-args4j-args4j-pom- \
osgi-org.kohsuke.args4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
