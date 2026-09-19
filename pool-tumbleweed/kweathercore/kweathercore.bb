SUMMARY = "Library to facilitate retrieval of weather information"
DESCRIPTION = "Get weather forecast and alerts anywhere on the earth easy. KWeatherCore \
provides you a highly abstracted library for things related to weather: \
Get local weather forecast, get weather of a location by name or coordinate, \
get sunrise/set moonrise/set and many more informations about a location."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kweathercore-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3020e38cfb5cf89b9bccfde1dea7827369ea93778ea735ade36a30d3f65c6ef59b8bdf6c40b4a2e81ff0d31cbd630238fd76f8566e5ad77dce1a2da42adbb6aa"

RPROVIDES:${PN} += "kweathercore \
libkweathercoreqmlplugin.so \
qt6qmlimport-org.kde.weathercore \
qt6qmlimport-org.kde.weathercore.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKWeatherCore.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
