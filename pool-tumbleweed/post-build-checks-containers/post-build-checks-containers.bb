SUMMARY = "OBS post-build hooks for Containers"
DESCRIPTION = "OBS post-build hooks to be executed for scanning containers. These hooks mainly \
consists of performing actions such as antivirus scans (via ClamAV) or \
vulnerability scans (via Trivy, NeuVector), generating artifacts that can later \
be attached to relevant OCI container image artifacts as OCI attestations."
LICENSE = "GPL-2.0-only"

PV = "0.1"

RPM_NAME = "post-build-checks-containers-0.1-6.1.aarch64.rpm"
RPM_HASH = "f39c60854bb77ea79d7f4bb74faaf834fd9c2716eda859db4547f066fab98ccb960439ba099754854983e8c753466aee6b027dad740934e20a9beea9429d086f"

RPROVIDES:${PN} += "post-build-checks-containers"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
