SUMMARY = "A framework for defining long-running services"
DESCRIPTION = "Cotyledon provides a framework for defining long-running services."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python313-cotyledon-2.2.0-1.3.noarch.rpm"
RPM_HASH = "83634d85d34d8cc39e04a5a253a8a79cd93cbdb8032509944c9ea7e5e6867a9e20742b6a9525aa4072f556297b1537baa59c5156cf7baa1e1e16310f220951e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cotyledon \
python3.13dist-cotyledon \
python313-cotyledon \
python3dist-cotyledon"

RDEPENDS:${PN} += "python-abi \
python313-setproctitle"

inherit rpm
