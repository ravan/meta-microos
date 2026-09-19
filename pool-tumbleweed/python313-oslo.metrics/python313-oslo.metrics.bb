SUMMARY = "Collect metrics data from other Oslo libraries"
DESCRIPTION = "This Oslo metrics API supports collecting metrics data from other \
Oslo libraries and exposing the metrics data to monitoring system."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python313-oslo.metrics-0.17.0-1.1.noarch.rpm"
RPM_HASH = "c39c860b4f11b63760da60779ff54e13c3009a046d8ce62de8c5e385099c089c4a45c22971f071d7e8d87a4475d68799b0cee995d62bfc9cf63a9ab44dd05e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.metrics \
python3.13dist-oslo.metrics \
python313-oslo.metrics \
python3dist-oslo.metrics"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-oslo.config \
python313-oslo.log \
python313-oslo.utils \
python313-pbr \
python313-prometheus-client"

inherit rpm
