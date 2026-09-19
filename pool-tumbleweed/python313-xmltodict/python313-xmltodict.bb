SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python313-xmltodict-1.0.4-2.3.noarch.rpm"
RPM_HASH = "38847268b661933e9af5db11290926b63e1b8a4f39b5dbec9127f3857a10df5b1b515dadd0a342537d0f1d45131c6f92f2d3cb25d902131a7935b5a4e34731e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmltodict \
python3.13dist-xmltodict \
python313-xmltodict \
python3dist-xmltodict"

RDEPENDS:${PN} += "python-abi \
python313-xml"

inherit rpm
