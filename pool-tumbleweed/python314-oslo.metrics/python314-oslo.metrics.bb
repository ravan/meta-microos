SUMMARY = "Collect metrics data from other Oslo libraries"
DESCRIPTION = "This Oslo metrics API supports collecting metrics data from other \
Oslo libraries and exposing the metrics data to monitoring system."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python314-oslo.metrics-0.17.0-1.1.noarch.rpm"
RPM_HASH = "39575f4d2a2c716e4c2457ce6e8d75a72c592ebc887a7286d135ae031054a4d1668aa02a080f12065b0df2db70e8973ff493f296a6a5a2e338028a776b62711e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.metrics \
python314-oslo.metrics \
python3dist-oslo.metrics"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-oslo.config \
python314-oslo.log \
python314-oslo.utils \
python314-pbr \
python314-prometheus-client"

inherit rpm
