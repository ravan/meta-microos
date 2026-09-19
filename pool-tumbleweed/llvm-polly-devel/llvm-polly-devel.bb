SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly. \
 \
This package is a dummy package that depends on the version of \
llvm-polly-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-polly-devel-23-1.1.aarch64.rpm"
RPM_HASH = "68885cdbd40ff7c55a4ac1edaea5f9278efb50c0e73de5d187bb9a04c6731954208171c38eaff44af5551621d6ef003a5f60ee3dd963c386c48a9b7b47071338"

RPROVIDES:${PN} += "llvm-polly-devel"

RDEPENDS:${PN} += "llvm-polly \
llvm23-polly-devel"

inherit rpm
