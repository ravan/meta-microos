SUMMARY = "Matrix protocol reference homeserver"
DESCRIPTION = "Synapse is a Python-based reference 'homeserver' implementation of \
Matrix. Matrix is a system for federated Instant Messaging and VoIP."
LICENSE = "AGPL-3.0-or-later"

PV = "1.160.0"

RPM_NAME = "matrix-synapse-1.160.0-1.3.aarch64.rpm"
RPM_HASH = "7a71e16eaeb994e5dda2910c825e4cd519d04ca76204596d77c7231a3215f20a6bc66706a5cbaee3004ca60ea441df7dd485fb57cf8b9b8aad10e4e024d9a0c4"

RPROVIDES:${PN} += "config-matrix-synapse \
group-synapse \
matrix-synapse \
python2-matrix-synapse \
python3.13dist-matrix-synapse \
python313-matrix-synapse \
python3dist-matrix-synapse \
user-synapse"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python313-Authlib \
python313-Jinja2 \
python313-Pillow \
python313-PyNaCl \
python313-PyYAML \
python313-Pympler \
python313-Twisted \
python313-attrs \
python313-base \
python313-bcrypt \
python313-bleach \
python313-canonicaljson \
python313-cffi \
python313-cryptography \
python313-defusedxml \
python313-idna \
python313-ijson \
python313-immutabledict \
python313-jsonschema \
python313-lxml \
python313-matrix-common \
python313-msgpack \
python313-netaddr \
python313-packaging \
python313-phonenumbers \
python313-prometheus-client \
python313-psutil \
python313-psycopg2 \
python313-pyOpenSSL \
python313-pyasn1 \
python313-pyasn1-modules \
python313-pydantic \
python313-pymacaroons \
python313-pyparsing \
python313-pyrsistent \
python313-pysaml2 \
python313-python-multipart \
python313-pytz \
python313-requests \
python313-rpds-py \
python313-service-identity \
python313-signedjson \
python313-sortedcontainers \
python313-systemd \
python313-treq \
python313-typing-extensions \
python313-unpaddedbase64 \
python313-urllib3 \
python313-zope.interface \
sysuser-shadow"

inherit rpm
