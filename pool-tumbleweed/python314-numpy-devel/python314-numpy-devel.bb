SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "2.5.3"

RPM_NAME = "python314-numpy-devel-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "545c1a9193bd0c18d15c54546fe7d1a741ab8fd7f22334b3a6b3965e7eb4690e9515636fd2668a06cfe50b82efe905d9562e23209347748f70a8dcbac3da09b8"

RPROVIDES:${PN} += "python314-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python314-devel \
python314-numpy"

inherit rpm
