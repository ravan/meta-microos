SUMMARY = "GNOME Shell integration for Chrome Extension compatible browsers"
DESCRIPTION = "Browser extension for Google Chrome/Chromium, Firefox, Vivaldi, Opera (and other \
Browser Extension, Chrome Extension or WebExtensions capable browsers) and native \
host messaging connector that provides integration with GNOME Shell and the \
corresponding extensions repository https://extensions.gnome.org."
LICENSE = "GPL-3.0-or-later"

PV = "42.1"

RPM_NAME = "gnome-browser-connector-42.1-5.3.aarch64.rpm"
RPM_HASH = "f8f64b22906ffa86eb5db3266aeebbdb9608e42ad2a77e12824bdf91da0d9e6a2a9fef34283b8327ed0b0f0c0d1dc36aa11a29328bdf1d9f0b5713d869e5cb9b"

RPROVIDES:${PN} += "chrome-gnome-shell \
config-gnome-browser-connector \
gnome-browser-connector"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
unzip"

inherit rpm
