SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python314-oktaloginwrapper-0.2.2-3.5.noarch.rpm"
RPM_HASH = "b8a84bcc26ab49bd86bef26cf0ec7b19132214261f783ff1c35f0cc1046616473266d82e59376c763523535a78d1b836ce75719c49fde6d2d166fa938e3325f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oktaloginwrapper \
python314-oktaloginwrapper \
python3dist-oktaloginwrapper"

RDEPENDS:${PN} += "python-abi \
python314-lxml \
python314-requests"

inherit rpm
