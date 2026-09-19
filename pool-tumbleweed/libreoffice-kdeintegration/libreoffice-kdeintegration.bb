SUMMARY = "KDE integration support for LibreOffice"
DESCRIPTION = "This package contains the necessary files to enable proper KDE integration for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-kdeintegration-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "1f33a8afd6b04fc2c0cd44f5fff1197dd67ea0b68328bdcdf400f16c249ceb2c7efbab2ccc16defe1114386684de840d8c0c3160d52714538413b016e74d5c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-kdeintegration"

RDEPENDS:${PN} += "libreoffice"

inherit rpm
