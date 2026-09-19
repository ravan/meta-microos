SUMMARY = "Generator of scala.Tuple/Function related boilerplate code"
DESCRIPTION = "Boilerplate is an sbt-plugin that generates stubs for code which has to be \
expanded for all numbers of arguments from 1 to 22. This is sometimes \
necessary to support all of the TupleX or FunctionX generically. \
 \
This package contains a simple command-line tool to expand the templates \
without using sbt mechanisms."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "sbt-boilerplate-0.6.1-3.7.noarch.rpm"
RPM_HASH = "de37f8c9b984841297042cbb31fe096f3a76d972ed6cabe54c6f58195daa4e1ef85a2c3dd6686f1e2b892ccefc9c880c9087b86df481e7dc409aa5646c13ad98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sbt-boilerplate"

RDEPENDS:${PN} += "/usr/bin/bash \
javapackages-tools \
scala \
scala-parser-combinators"

inherit rpm
