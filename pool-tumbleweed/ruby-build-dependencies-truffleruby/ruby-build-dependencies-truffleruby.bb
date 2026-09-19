SUMMARY = "Meta package for dependencies to build TruffleRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build TruffleRuby."
LICENSE = "MIT"

PV = "20260902"

RPM_NAME = "ruby-build-dependencies-truffleruby-20260902-1.1.noarch.rpm"
RPM_HASH = "b1dfdb31c15979f350af4c36d0fc1864f888dc92736e9c64e34ad894934c562ca6165eb84793134e1649311c2b222078a99cebed5fcfdafd6fc3e6cc29c5c423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-truffleruby"

RDEPENDS:${PN} += "gcc \
openssl-devel"

inherit rpm
