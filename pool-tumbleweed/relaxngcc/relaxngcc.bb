SUMMARY = "RELAX NG Compiler Compiler"
DESCRIPTION = "RelaxNGCC is a tool for generating Java source code from a given RELAX NG \
grammar. By embedding code fragments in the grammar like yacc or JavaCC, you can \
take appropriate actions while parsing valid XML documents against the grammar."
LICENSE = "Apache-1.1"

PV = "1.12"

RPM_NAME = "relaxngcc-1.12-3.13.noarch.rpm"
RPM_HASH = "c124afac19eb7c5904a59c10531d41d3ad3df73cb019c45f21de9e28b3e9fb7472bc56432dddbfa8f087769ae74fd648d524663d3e6354f7fc4cc3af774be428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "relaxngcc"

RDEPENDS:${PN} += "isorelax \
msv-msv \
msv-xsdlib \
relaxngDatatype \
xerces-j2 \
xml-commons-apis"

inherit rpm
