SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python313-oktaloginwrapper-0.2.2-3.5.noarch.rpm"
RPM_HASH = "baa394372b2aeacd234b499e19a48e6fedd913f8fbaed820699dfca0bf625a445ad851173689c6e02bc888c34dbaaa737692431f4f8a8500ad03f940b6b80ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oktaloginwrapper \
python3.13dist-oktaloginwrapper \
python313-oktaloginwrapper \
python3dist-oktaloginwrapper"

RDEPENDS:${PN} += "python-abi \
python313-lxml \
python313-requests"

inherit rpm
