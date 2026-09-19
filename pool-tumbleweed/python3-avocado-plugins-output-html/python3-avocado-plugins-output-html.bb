SUMMARY = "Avocado HTML report plugin"
DESCRIPTION = "This plugin adds the ability for Avocado to generate an HTML report in every \
job result directory. It also gives the user the ability to write a report to \
an arbitrary filesystem location."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-output-html-113.0-1.2.noarch.rpm"
RPM_HASH = "f8e63f5788879bb635bc8f92ee97e992163f25439693a08c7060b532e2d2f45703a472572b326e0b24ff782830ca57d03de23d02bce4374c524e06f8b375aca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-output-html \
python3.13dist-avocado-framework-plugin-result-html \
python3dist-avocado-framework-plugin-result-html"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-pystache"

inherit rpm
