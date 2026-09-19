SUMMARY = "Jsonnet implementation in pure Go"
DESCRIPTION = "Feature complete, production-ready implementation of Jsonnet. It is compatible with the original \
Jsonnet C++ implementation."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "golang-github-google-jsonnet-0.22.0-1.5.aarch64.rpm"
RPM_HASH = "f43250f2ddfadabcd7707c8eef3edb6b39c133506d1021edcb0eaaa2cd3c7371b2441c7dab22d6ab9b8b85135af0afc77985b52cae40e798e00987692334e8e2"

RPROVIDES:${PN} += "golang-github-google-jsonnet \
jsonnet"

RDEPENDS:${PN} += ""

inherit rpm
