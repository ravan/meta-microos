SUMMARY = "Development headers and libraries for kim-api"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the development files (headers and documentation) for the \
KIM-API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "kim-api-devel-2.3.0-2.9.aarch64.rpm"
RPM_HASH = "4a7d112bfb9e52b93c98a95bd2918e2110fc45da34ae3a9f99daaa91dfe3def346499ad97fe49ca1b6c801487acb1381e277603cd34ae709ad4d9f4e41cf66f7"

RPROVIDES:${PN} += "cmake-kim-api \
cmake-kim-api-items \
kim-api-devel \
pkgconfig-libkim-api"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kim-api \
libkim-api2 \
vim"

inherit rpm
