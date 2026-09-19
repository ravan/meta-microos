SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python client for Prometheus."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "0.25.0"

RPM_NAME = "python313-prometheus-client-0.25.0-1.2.noarch.rpm"
RPM_HASH = "3e7a54538a7af3706f49857c87ff08e96ce6782aceebdba79a422612a7679b92ddedd911aff5a5ebd7ce15830df1aabecbd51ef61127b8874a11d78bd4328018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prometheus-client \
python3.13dist-prometheus-client \
python313-prometheus-client \
python3dist-prometheus-client"

RDEPENDS:${PN} += "python-abi"

inherit rpm
