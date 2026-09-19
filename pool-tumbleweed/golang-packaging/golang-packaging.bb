SUMMARY = "A toolchain to help packaging golang"
DESCRIPTION = "A toolchain to help packaging golang, written in bash."
LICENSE = "GPL-3.0-only"

PV = "15.0.17"

RPM_NAME = "golang-packaging-15.0.17-2.10.noarch.rpm"
RPM_HASH = "90b3e361c18a783c59d808f486e973733dc5452c22307eed826f86f7ee0e4b907be317de9635524e23054cab04dfcb56854624201aa04f472853ecb57471a841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-packaging \
rpm-macro-go-api-ver \
rpm-macro-go-arch \
rpm-macro-go-bindir \
rpm-macro-go-contribdir \
rpm-macro-go-contribsrcdir \
rpm-macro-go-dir \
rpm-macro-go-exclusivearch \
rpm-macro-go-nostrip \
rpm-macro-go-provides \
rpm-macro-go-sitearch \
rpm-macro-go-sitedir \
rpm-macro-go-srcdir \
rpm-macro-go-tooldir \
rpm-macro-go-ver \
rpm-macro-gobuild \
rpm-macro-godoc \
rpm-macro-gofilelist \
rpm-macro-goinstall \
rpm-macro-goprep \
rpm-macro-gosrc \
rpm-macro-gotest"

RDEPENDS:${PN} += "/usr/bin/env \
go"

inherit rpm
