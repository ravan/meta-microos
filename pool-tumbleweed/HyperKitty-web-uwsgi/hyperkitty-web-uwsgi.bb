SUMMARY = "HyperKitty - uwsgi configuration"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the uwsgi configuration."
LICENSE = "GPL-3.0-only"

PV = "1.3.12"

RPM_NAME = "HyperKitty-web-uwsgi-1.3.12-7.1.noarch.rpm"
RPM_HASH = "a1971a885ec3859d309879f5b9e420f7d3dce9032fe230fca9759cbcc0fd8a81d0fd6ad9cc9e6048d2c347e470f85d07f60baf2e95d1f8f8f08053e68e9b21ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web-uwsgi \
config-HyperKitty-web-uwsgi"

RDEPENDS:${PN} += "HyperKitty-web \
python313-uwsgi-python3"

inherit rpm
