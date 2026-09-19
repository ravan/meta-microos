SUMMARY = "Middleware for OpenStack Identity"
DESCRIPTION = "This package contains middleware modules designed to provide authentication \
and authorization features to web services other than Keystone \
The most prominent module is keystonemiddleware.auth_token. This package \
does not expose any CLI or Python API features."
LICENSE = "Apache-2.0"

PV = "13.0.1"

RPM_NAME = "python314-keystonemiddleware-13.0.1-1.1.noarch.rpm"
RPM_HASH = "ecd9455a3bf7ffedf55cfcd40fcf8e75740bf48d086ef6f23895d3116a5e2587e001e1489433c9406a4e240d1a2bbdfdb6c877c67a631ebdc73f9614e3620418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-keystonemiddleware \
python314-keystonemiddleware \
python3dist-keystonemiddleware"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-WebOb \
python314-keystoneauth1 \
python314-keystoneclient \
python314-oslo.cache \
python314-oslo.config \
python314-oslo.context \
python314-oslo.i18n \
python314-oslo.log \
python314-oslo.messaging \
python314-oslo.serialization \
python314-oslo.utils \
python314-pycadf \
python314-python-memcached \
python314-requests"

inherit rpm
