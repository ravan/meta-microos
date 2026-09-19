SUMMARY = "openSUSE branding of MozillaFirefox"
DESCRIPTION = "This package provides openSUSE look and feel for Firefox."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "68"

RPM_NAME = "firefox-esr-branding-openSUSE-68-6.1.aarch64.rpm"
RPM_HASH = "443856155fca5f113c5700b7096d4b9c066f0590843c6017c25a997325702d94204888c7924e62c35a33357da0226aa0fad43869bb47416c8eca64e6ebff7c6e"

RPROVIDES:${PN} += "firefox-esr-branding \
firefox-esr-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
