SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python314-xmltodict-1.0.4-2.3.noarch.rpm"
RPM_HASH = "9cd42d50b29b40d02ea4c08cbd052ac8680d25c34fd3be531661341d0ae4d8e47622281e20260c385620b576b72461405a4e226d091c92c42f0b3db8b3683ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xmltodict \
python314-xmltodict \
python3dist-xmltodict"

RDEPENDS:${PN} += "python-abi \
python314-xml"

inherit rpm
