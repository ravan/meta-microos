SUMMARY = "Style and Grammar Checker for 25+ Languages"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-4.8-13.1.aarch64.rpm"
RPM_HASH = "f59ac06c29b08574fc5b90c053b91db4745778113c7886154b3ed03573525714e9f6dc538f108cb7816825b49086894155bedf490ef40bcfcf02f67cf1e649f3"

RPROVIDES:${PN} += "languagetool"

RDEPENDS:${PN} += "/usr/bin/sh \
aho-corasick-double-array-trie \
apache-commons-cli \
apache-commons-codec \
apache-commons-collections4 \
apache-commons-csv \
apache-commons-io \
apache-commons-lang3 \
apache-commons-logging \
apache-commons-pool2 \
apache-commons-text \
beust-jcommander \
catalan-pos-dict \
german-pos-dict \
glassfish-activation-api \
glassfish-annotation-api \
glassfish-fastinfoset \
glassfish-jaxb-api \
glassfish-jaxb-runtime \
glassfish-jaxb-txw2 \
google-errorprone-annotations \
guava \
hamcrest \
hppc \
indriya \
istack-commons-runtime \
j2objc-annotations \
jackson-annotations \
jackson-core \
jackson-databind \
jafama \
java-diff-utils \
java-jwt \
javassist \
jetbrains-annotations \
jline3 \
jna \
jna-contrib \
jspecify \
junit \
jwnl \
jwordsplitter \
kryo \
language-detector \
languagetool-core \
languagetool-core-tests \
languagetool-libs \
languagetool-tools \
logback \
lucene-backward-codecs \
lucene-core \
mariadb-java-client \
minlog \
morfologik-stemming \
mybatis \
objectweb-asm \
objenesis \
ognl \
opennlp-chunk-models \
opennlp-maxent \
opennlp-postag-models \
opennlp-tokenize-models \
opennlp-tools \
openregex \
prometheus-simpleclient-java \
prometheus-simpleclient-java-common \
prometheus-simpleclient-java-guava \
prometheus-simpleclient-java-hotspot \
prometheus-simpleclient-java-httpserver \
prometheus-simpleclient-java-tracer-common \
reflectasm \
scala \
segment \
slf4j \
stax-ex \
unit-api \
uom-lib-common \
xgboost \
xgboost-predictor"

inherit rpm
