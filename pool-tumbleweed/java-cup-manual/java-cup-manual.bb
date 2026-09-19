SUMMARY = "LALR Parser Generator in Java"
DESCRIPTION = "java-cup is a LALR Parser Generator in Java. With v0.11, you can: * \
   use CUP in an Ant-Target \
 \
* start CUP by a simple command like java -jar java-cup-11a.jar \
   myGrammar.cup \
 \
* use generic parametrized classes (since Java 1.5) as datatypes for \
   non \
 \
* terminals and terminals \
 \
* have Your own symbol classes"
LICENSE = "HPND"

PV = "0.11"

RPM_NAME = "java-cup-manual-0.11-33.10.noarch.rpm"
RPM_HASH = "eda3182acd1d8d5c823f2ffba8b42e4e20905af879b76bd21fa723a2f340e75e33d6c816498f3aa4197ff5e01656993228554be0d628c4bc422ca8d6edac0ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-cup-manual"

RDEPENDS:${PN} += ""

inherit rpm
