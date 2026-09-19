SUMMARY = "Library to facilitate retrieval of weather information"
DESCRIPTION = "Shared objects for kweathercore. \
Get weather forecast and alerts anywhere on the earth easy. KWeatherCore \
provides you a highly abstracted library for things related to weather: \
Get local weather forecast, get weather of a location by name or coordinate, \
get sunrise/set moonrise/set and many more informations about a location."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKWeatherCore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e00c8c7dd2c631bc82cbba4946f88234271cf446ed9a0eb6a882c03e88091ac886827403f91b6cc5d12ba273258a59f0ebd44b9eaa4d5fbfc6ac249cd1724265"

RPROVIDES:${PN} += "libKWeatherCore.so.6 \
libKWeatherCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6I18nLocaleData.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
