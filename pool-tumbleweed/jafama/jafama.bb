SUMMARY = "A (Strict) FastMath class with 1e-15ish accuracy"
DESCRIPTION = "Jafama (Java Fast Math) is a Java library aiming at providing faster versions \
of java.lang.Math treatments, at the eventual cost of 1e-15ish accuracy errors \
but still handling special cases properly (NaN, +-Infinity, ties, etc.). \
It also provides additional features, such as angles normalization methods, \
inverse hyperbolic trigonometry, etc."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "jafama-2.3.2-1.5.noarch.rpm"
RPM_HASH = "dba2a607da8c4bac45a1628eb149d915ee911ff229c8a106f03e25d789c47082f52b2d6e5b62f04b23093f5a7ae1086b01e4e6e1c393d1f0173b56a1f8cc58eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jafama \
mvn-net.jafama-jafama \
mvn-net.jafama-jafama-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
