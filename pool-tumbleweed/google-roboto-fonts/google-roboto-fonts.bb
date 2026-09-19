SUMMARY = "Neo-grotesque sans-serif typeface family from Google"
DESCRIPTION = "Roboto is Google’s signature family of fonts, the default font on Android and \
Chrome OS, and the recommended font for Google’s visual language, Material Design. \
 \
The font family supports all Latin, Cyrillic, and Greek characters in Unicode 7.0, \
as well as the currency symbol for the Georgian lari, to be published in Unicode 8.0. \
 \
The fonts are currently available in eighteen different styles."
LICENSE = "Apache-2.0"

PV = "2.138"

RPM_NAME = "google-roboto-fonts-2.138-2.13.noarch.rpm"
RPM_HASH = "35b933cd1dc8cd40b72ab75bf9e5f3bbb7a41b059da2749428729fe6e181e4345a889a4c0f26d847808fd0e89d344831959e719baefaddb6e7966557988133a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-roboto-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
