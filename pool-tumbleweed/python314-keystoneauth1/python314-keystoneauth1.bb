SUMMARY = "OpenStack authenticating tools"
DESCRIPTION = "Tools for authenticating to an OpenStack-based cloud. These tools include: \
* Authentication plugins (password, token, and federation based) \
* Discovery mechanisms to determine API version support \
* A session that is used to maintain client settings across requests \
  (based on the requests Python library)"
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "python314-keystoneauth1-5.17.0-1.1.noarch.rpm"
RPM_HASH = "5911057ba6da16bf19c364e4daefbd40f08b3013130896115f8ea8ad8bbc7141cc1f1ad998b37fa2a621f25a0b362da2be579e8561b5931595e881c5cbaa9c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-keystoneauth1 \
python314-keystoneauth1 \
python3dist-keystoneauth1"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-iso8601 \
python314-lxml \
python314-oauthlib \
python314-os-service-types \
python314-requests \
python314-requests-kerberos \
python314-stevedore \
python314-typing-extensions"

inherit rpm
