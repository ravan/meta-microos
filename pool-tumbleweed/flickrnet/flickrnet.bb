SUMMARY = "Flickr"
DESCRIPTION = "The Flickr.Net API is a .Net Library for accessing the Flickr API. Written entirely in C# it can be accessed from with any .Net language."
LICENSE = "LGPL-2.1+ | CPL-1.0"

PV = "3.5"

RPM_NAME = "flickrnet-3.5-8.26.noarch.rpm"
RPM_HASH = "7b0db4448d579e9d533f1a5d3ed981d0b832c58ab2d71ef3aefc03d873600cae32f2dabb8dfd5a74280d030abded2b4bef22a0589cade1b20ff9e4bc9ee4d2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flickrnet \
mono-FlickrNet"

RDEPENDS:${PN} += "mono-System \
mono-System.Configuration \
mono-System.Drawing \
mono-System.Xml \
mono-mscorlib"

inherit rpm
