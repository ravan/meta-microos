SUMMARY = "Middleware for OpenStack Identity"
DESCRIPTION = "This package contains middleware modules designed to provide authentication \
and authorization features to web services other than Keystone \
The most prominent module is keystonemiddleware.auth_token. This package \
does not expose any CLI or Python API features."
LICENSE = "Apache-2.0"

PV = "13.0.1"

RPM_NAME = "python313-keystonemiddleware-13.0.1-1.1.noarch.rpm"
RPM_HASH = "821f7e950da7d9f4e96f5db00dd9de1dd28b21674bfb4e2c98f5aa49e398c5cbe7867aa7acda9c4b0d42cd1d6bf1ae8e2e035911573a5f2a60c18841edf1fcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystonemiddleware \
python3.13dist-keystonemiddleware \
python313-keystonemiddleware \
python3dist-keystonemiddleware"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-WebOb \
python313-keystoneauth1 \
python313-keystoneclient \
python313-oslo.cache \
python313-oslo.config \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.messaging \
python313-oslo.serialization \
python313-oslo.utils \
python313-pycadf \
python313-python-memcached \
python313-requests"

inherit rpm
