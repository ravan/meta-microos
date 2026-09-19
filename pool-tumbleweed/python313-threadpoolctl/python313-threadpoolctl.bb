SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python313-threadpoolctl-3.6.0-2.1.noarch.rpm"
RPM_HASH = "ff3d0667e7b1738b4e37cd8d516db06af6f9573ae9ec0487da13e389292237fb6f9b765ce40e4d816419c9e35f562158787b3006a739e428d83a0c842bd315d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-threadpoolctl \
python3.13dist-threadpoolctl \
python313-threadpoolctl \
python3dist-threadpoolctl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
