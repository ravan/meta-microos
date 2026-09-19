SUMMARY = "JSR 363 - Units of Measurement API"
DESCRIPTION = "The Unit of Measurement library provides a set of \
Java language programming interfaces for handling \
units and quantities. The interfaces provide a layer \
which separates client code, which would call the \
API, from library code, which implements the API. \
 \
The specification contains Interfaces and abstract \
classes with methods for unit operations: \
 \
* Checking of unit compatibility \
* Expression of a quantity in various units \
* Arithmetic operations on units"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "unit-api-1.0-3.10.noarch.rpm"
RPM_HASH = "2fada06dc90b3a7b903cbe2b40e4f39ee1a462902fc04c531ac448ea2654b98af5232dabf615069e68f1b5100d0a2eec74a79d1d55cd4f40bfe21420ee31d683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-javax.measure-unit-api \
mvn-javax.measure-unit-api-pom- \
osgi-javax.measure.unit-api \
unit-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
