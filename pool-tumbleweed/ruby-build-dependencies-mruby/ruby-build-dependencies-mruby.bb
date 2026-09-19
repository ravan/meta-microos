SUMMARY = "Meta package for dependencies to build mruby"
DESCRIPTION = "Meta package for ruby-build dependencies to build mruby."
LICENSE = "MIT"

PV = "20260902"

RPM_NAME = "ruby-build-dependencies-mruby-20260902-1.1.noarch.rpm"
RPM_HASH = "de4f4b8858101c1cead702f8c549b9faba820dbb0f7744bef9a8a6b2f07e0a44cdd7150e5f8ae013ce578c5e9f8c5145257c9276e0f18b1aa0e17bfa88aab17e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
