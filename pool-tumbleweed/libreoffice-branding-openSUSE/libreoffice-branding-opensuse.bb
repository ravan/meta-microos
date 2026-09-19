SUMMARY = "openSUSE Tumbleweed branding for LibreOffice"
DESCRIPTION = "openSUSE Tumbleweed branding for LibreOffice"
LICENSE = "BSD-3-Clause"

PV = "84.87.20240405"

RPM_NAME = "libreoffice-branding-openSUSE-84.87.20240405-5.5.noarch.rpm"
RPM_HASH = "26a5311057e9171fc424b477bcbb83c99513952806a1decdaaae8859054b7a47bd4ed48ea79d7a169256e320acd4c4d77bb46d1cda1bad88b7a34955601777cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
