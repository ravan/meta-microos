SUMMARY = "Avocado Plugin to propagate Job results to a remote host"
DESCRIPTION = "This optional plugin is intended to upload the Avocado Job results to \
a dedicated sever."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-result-upload-113.0-1.2.noarch.rpm"
RPM_HASH = "d9322da4e2f99f3977e8f01d7aaff97a3f1400d1f1e5929394df3adf2faef204ba58a78bb0f3d6478457c447870a57f74c756515481f39acaed0e8df2014c9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-result-upload \
python3.13dist-avocado-framework-plugin-result-upload \
python3dist-avocado-framework-plugin-result-upload"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
