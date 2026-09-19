SUMMARY = "Prometheus Alertmanager receiver for SNMP traps"
DESCRIPTION = "prometheus-webhook-snmp is a Prometheus Alertmanager receiver that \
translates incoming notifications into SNMP traps."
LICENSE = "GPL-3.0"

PV = "1.4"

RPM_NAME = "prometheus-webhook-snmp-1.4-3.7.noarch.rpm"
RPM_HASH = "a73564c6e7f5e34457f5abf1eb299533bcc81b318e9a29e89d8332365a5fec4437e8d0b3eba624034765198d559639daa3fe7bc8c9f50f1701f9c452a7337648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-webhook-snmp"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-CherryPy \
python3-PyYAML \
python3-click \
python3-dateutil \
python3-prometheus-client \
python3-pysnmp"

inherit rpm
