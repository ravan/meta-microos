SUMMARY = "Extra RPM macros for building Haskell packages with several libs"
DESCRIPTION = "Extra macros used for subpackaging of Haskell libraries, \
for example in ghc and haskell-platform."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "ghc-rpm-macros-extra-2.9.2-1.4.noarch.rpm"
RPM_HASH = "c10da36ab408bc6992944a87b2d60664e236a12933a343d9d8f508d8ceabe0f15d5b5fd2333a5550bb47f48350d4b7e1370a5408789ee808cd0d85a9cedc6c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-rpm-macros-extra \
rpm-macro-ghc-lib-subpackage \
rpm-macro-ghc-libs-build \
rpm-macro-ghc-libs-install \
rpm-macro-ghc-merge-filelist"

RDEPENDS:${PN} += "ghc-rpm-macros"

inherit rpm
