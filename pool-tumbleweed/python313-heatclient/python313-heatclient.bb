SUMMARY = "Python API and CLI for OpenStack Heat"
DESCRIPTION = "This is a client for the OpenStack Heat API. There's a Python API (the \
heatclient module), and a command-line script (heat). Each implements 100% of \
the OpenStack Heat API."
LICENSE = "Apache-2.0"

PV = "5.3.0"

RPM_NAME = "python313-heatclient-5.3.0-1.1.noarch.rpm"
RPM_HASH = "dd34cd31ffb142e94f5a355f3075b90064f10110e73c52d75ae54011f52002b652aed5d2cf0febb58c29dbb4bd16aa657915847a3ef32e776211cbcca5d6c213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-heatclient \
python3.13dist-python-heatclient \
python313-heatclient \
python3dist-python-heatclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-Babel \
python313-PrettyTable \
python313-PyYAML \
python313-cliff \
python313-iso8601 \
python313-openstackclient \
python313-osc-lib \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-requests \
python313-swiftclient"

inherit rpm
