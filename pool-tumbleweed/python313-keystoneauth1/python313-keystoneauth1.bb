SUMMARY = "OpenStack authenticating tools"
DESCRIPTION = "Tools for authenticating to an OpenStack-based cloud. These tools include: \
* Authentication plugins (password, token, and federation based) \
* Discovery mechanisms to determine API version support \
* A session that is used to maintain client settings across requests \
  (based on the requests Python library)"
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "python313-keystoneauth1-5.17.0-1.1.noarch.rpm"
RPM_HASH = "7449bea9dd28d256ec58915e917a607c631908e877e1958740cd0bb4dddb44df553173db7a1c0bf6664840a7dcf3f77dc50be20f5afb58a02f5350749d0e2cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystoneauth1 \
python3.13dist-keystoneauth1 \
python313-keystoneauth1 \
python3dist-keystoneauth1"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-iso8601 \
python313-lxml \
python313-oauthlib \
python313-os-service-types \
python313-requests \
python313-requests-kerberos \
python313-stevedore \
python313-typing-extensions"

inherit rpm
