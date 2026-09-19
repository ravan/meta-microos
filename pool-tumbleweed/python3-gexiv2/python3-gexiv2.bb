SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the Python 3 bindings for the libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "python3-gexiv2-0.16.2-1.1.noarch.rpm"
RPM_HASH = "2d8b4e161ca688717be4a6d9195618dc5931ba6f6a7caece1465f6bc91a9b53a7e3aab212e5eb73387b4103de0b256625662ac56c9a2d4296b643182b404f2c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gexiv2"

RDEPENDS:${PN} += "python-abi \
python3-gobject \
typelib-GExiv2"

inherit rpm
