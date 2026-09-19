SUMMARY = "DOM Conformance Test Suite"
DESCRIPTION = "The DOM Test Suites (DOM TS) will consist of a number of tests for each \
level of the DOM specification. The tests will be represented in an XML \
grammar which ensures that tests can easily be ported from the \
description format to a number of specific language bindings. This \
grammar will be specified in XML Schema and DTD form. The grammar will \
be automatically generated from the DOM specifications themselves, to \
ensure stability and correctness."
LICENSE = "W3C"

PV = "0.0.1"

RPM_NAME = "dom2-core-tests-0.0.1-31.9.noarch.rpm"
RPM_HASH = "b4d509a3ec70cab393343e72871311e446df8da7f9acd76240988ce9e90426a70a1cf892a7eeecca6a3314c7d30deda434c9bc34579748385e40d11997cce3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom2-core-tests"

RDEPENDS:${PN} += ""

inherit rpm
