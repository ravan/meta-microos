SUMMARY = "Python3 binding for the GObject Dara Mapper"
DESCRIPTION = "This is a DataMapper for GObject. \
 \
With this package you can glue gom to python3."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.6"

RPM_NAME = "python3-gom-0.5.6-1.3.aarch64.rpm"
RPM_HASH = "e835d49332019f9d866addb746987b20a3512f73bb3434f7ad169c1219b40fe309676e18d8fe70cf5e5958addefe9c05fb3dbe67c315ee4436799c958f706274"

RPROVIDES:${PN} += "python3-gom"

RDEPENDS:${PN} += "python-abi \
typelib-Gom"

inherit rpm
