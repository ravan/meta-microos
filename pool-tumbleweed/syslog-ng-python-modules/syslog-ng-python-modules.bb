SUMMARY = "Python modules for syslog-ng"
DESCRIPTION = "This package provides python modules for syslog-ng, for \
Kubernetes log enrichment, Hypr support, etc."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-python-modules-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "5cf5a71ddbe86b0264da36c40ae2303b5d01a9088c5ab074c463b3c4dd4134c9f10519d765696656229859bf037f496d009848306af916aedbf4ff352078a7a4"

RPROVIDES:${PN} += "syslog-ng-python-modules"

RDEPENDS:${PN} += "python3-PyYAML \
python3-cachetools \
python3-certifi \
python3-charset-normalizer \
python3-google-auth \
python3-idna \
python3-kubernetes \
python3-pip \
python3-pyasn1 \
python3-pyasn1-modules \
python3-python-dateutil \
python3-requests \
python3-rsa \
python3-six \
python3-websocket-client \
syslog-ng \
syslog-ng-python"

inherit rpm
