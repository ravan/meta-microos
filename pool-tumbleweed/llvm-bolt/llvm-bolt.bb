SUMMARY = "A post-link optimizer developed to speed up large applications"
DESCRIPTION = "BOLT is a post-link optimizer developed to speed up large applications. \
It achieves the improvements by optimizing application's code layout based on \
execution profile gathered by sampling profiler, such as Linux `perf` tool. \
 \
This package is a dummy package that depends on the version of \
llvm-bolt that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-bolt-23-1.1.aarch64.rpm"
RPM_HASH = "ec757d6ac31f7562a04b35cbaf9c81aad36f47eb4a499b87d353add24d165f80adeff2f830d6ba7d252a9eb7036c162c281669594a151b9d69e53707185bdf70"

RPROVIDES:${PN} += "llvm-bolt"

RDEPENDS:${PN} += "llvm23-bolt"

inherit rpm
