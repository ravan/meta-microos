SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python313-pyowm-3.5.0-1.3.noarch.rpm"
RPM_HASH = "7dc51b048049f8ce32ad5b58b63c5321108d5e30e83c7e65d446ffc309cd9ae31e281b3846af1c489bed352281612e8ef593a67bc6b565949dbfc8db767713f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyowm \
python3.13dist-pyowm \
python313-pyowm \
python3dist-pyowm"

RDEPENDS:${PN} += "python-abi \
python313-PySocks \
python313-geojson \
python313-requests \
python314-PySocks \
python314-geojson \
python314-requests"

inherit rpm
