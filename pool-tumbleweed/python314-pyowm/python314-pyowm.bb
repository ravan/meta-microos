SUMMARY = "A Python wrapper around the OpenWeatherMap web API"
DESCRIPTION = "PyOWM is a client Python wrapper library for the OpenWeatherMap web API. \
It allows quick and easy consumption of OWM weather data from Python \
applications via a simple object model and in a human-friendly fashion."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python314-pyowm-3.5.0-1.3.noarch.rpm"
RPM_HASH = "aec85b5250b68af9857d894b615992916194dd2fe34addf7fe96ea5fab3066670cdf518c8238a5324dd0df97d6b87b36caa49bb3335529d37489672653c75c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyowm \
python314-pyowm \
python3dist-pyowm"

RDEPENDS:${PN} += "python-abi \
python313-PySocks \
python313-geojson \
python313-requests \
python314-PySocks \
python314-geojson \
python314-requests"

inherit rpm
