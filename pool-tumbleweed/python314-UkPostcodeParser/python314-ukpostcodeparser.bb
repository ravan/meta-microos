SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python314-UkPostcodeParser-1.1.2-6.5.noarch.rpm"
RPM_HASH = "2a438c2dc5cb6aa9519cb1245fe7386caea6ff770915a121408008695f796da08be4b1cd677b6b7bc216610e5c7e80be8fbd34558e526240a22abb47e1678fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ukpostcodeparser \
python314-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python314-base"

inherit rpm
