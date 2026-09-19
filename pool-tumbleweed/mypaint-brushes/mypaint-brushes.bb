SUMMARY = "Brushes to be used with the MyPaint library"
DESCRIPTION = "This package contains brush files for use with MyPaint and other programs."
LICENSE = "CC0-1.0"

PV = "2.0.2"

RPM_NAME = "mypaint-brushes-2.0.2-1.17.noarch.rpm"
RPM_HASH = "486649658efcdd713682def09048bffcd1a8da38350450017c6388c40aeb09628347083eb4a8eba5d1a4e2813da8571f68c64aa1c03ee3500d93713f02a8dff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes"

RDEPENDS:${PN} += ""

inherit rpm
