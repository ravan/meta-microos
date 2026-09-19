SUMMARY = "An OBS source service: Update spec file version"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
Service to update the changelog from git commits."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "obs-service-update_changelog-0.6.1-2.2.noarch.rpm"
RPM_HASH = "6fa959518cbe121d9b1c0caa9a3bb58a9fa4212dc175c6220329d3684e3c2afaef137488e41bf1d9892c4bfd4d1ea0bbfd85ddbc9984aaaac06cbfcc7f57ffed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-update-changelog \
python3-obs-service-update-changelog \
python3.13dist-updatechangelog \
python313-obs-service-update-changelog \
python3dist-updatechangelog"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-GitPython \
python3-Jinja2 \
python3-py \
python3-pytz \
update-alternatives"

inherit rpm
