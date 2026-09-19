SUMMARY = "Fence agent for GCE (Google Cloud Engine)"
DESCRIPTION = "Fence agent for GCE (Google Cloud Engine) instances."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-gce-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "fa1dbed2c05e586f891c966ba174089674efb62d275932e75d8ef93505d015fc4cfdd29a555e03457b2006e15a19c7032ca643ce77a11e46bda485c52cd80602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-gce"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3-google-api-python-client"

inherit rpm
