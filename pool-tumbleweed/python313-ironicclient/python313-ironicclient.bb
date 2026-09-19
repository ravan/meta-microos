SUMMARY = "Python API and CLI for OpenStack Ironic"
DESCRIPTION = "OpenStack Bare Metal Provisioning API Client Library \
 \
This is a client for the OpenStack Ironic API. It provides a Python API (the \
ironicclient module) and a command-line interface (ironic)."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python313-ironicclient-6.3.0-1.1.noarch.rpm"
RPM_HASH = "764942b17c50f3eada9cd26bee570b809c26b51b082274bf833bfd07508163ce05cf5be4b3b58c94fbf50eb4feb60da1aa94957965d25a785c1827daf7d2dbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ironicclient \
python3.13dist-python-ironicclient \
python313-ironicclient \
python3dist-python-ironicclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-PyYAML \
python313-cliff \
python313-dogpile.cache \
python313-jsonschema \
python313-keystoneauth1 \
python313-openstacksdk \
python313-osc-lib \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-pbr \
python313-platformdirs \
python313-requests \
python313-stevedore"

inherit rpm
