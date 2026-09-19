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

RPM_NAME = "python314-oslo.config-10.7.0-1.1.noarch.rpm"
RPM_HASH = "38e28274c0a86dfd0690d3c5f0009125a9223bb35775a74a6f91af274af869a594b292150f6837b0f6c63ec32b10ddc4c302859509bcdfa829ba97346f2c68f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.config \
python314-oslo.config \
python3dist-oslo.config"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-netaddr \
python314-oslo.i18n \
python314-pbr \
python314-requests \
python314-rfc3986 \
python314-stevedore"

inherit rpm
