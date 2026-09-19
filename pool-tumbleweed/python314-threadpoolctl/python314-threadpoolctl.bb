SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python314-threadpoolctl-3.6.0-2.1.noarch.rpm"
RPM_HASH = "5896e123aaae72aa37bf0009cfaa23a92bf83a5ed5d7c428f55dfaf575978e558a6df9ed3c81aa84e17f1c141300121e1a4a9a8284349928f0ff1a57294b6f14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-threadpoolctl \
python314-threadpoolctl \
python3dist-threadpoolctl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
