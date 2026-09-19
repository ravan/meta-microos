SUMMARY = "OpenStack common configuration library"
DESCRIPTION = "The Oslo project intends to produce a python library containing \
infrastructure code shared by OpenStack projects. The APIs provided \
by the project should be high quality, stable, consistent and generally \
useful. \
 \
The oslo-config library is a command line and configuration file \
parsing library from the Oslo project."
LICENSE = "Apache-2.0"

PV = "10.7.0"

RPM_NAME = "python313-oslo.config-10.7.0-1.1.noarch.rpm"
RPM_HASH = "c10f01cb7510413f02135d19cb0be70b6e3a81ad896eb02fd165896c993a46fea2ec8a77e9ee6f156e3c3457a5661975a68fe82b8aa0993800e302079f5e072b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.config \
python3.13dist-oslo.config \
python313-oslo.config \
python3dist-oslo.config"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-netaddr \
python313-oslo.i18n \
python313-pbr \
python313-requests \
python313-rfc3986 \
python313-stevedore"

inherit rpm
