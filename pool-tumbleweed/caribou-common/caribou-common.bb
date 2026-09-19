SUMMARY = "On-screen Keyboard for GNOME -- Common data files"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-common-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "544c72730dfbd1fe0b4bc587458b0207e8c945755bd3b6e9004336cb9627bed1a8f93e321f1f003f123343f52fc6846cbcfd3fdaffc28a4f8ffae56ab4cf70e0"

RPROVIDES:${PN} += "caribou-common"

RDEPENDS:${PN} += ""

inherit rpm
