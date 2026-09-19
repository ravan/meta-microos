SUMMARY = "Development files for Flickr.Net"
DESCRIPTION = "The Flickr.Net API is a .NET Library for interacting with the Flickr API. It \
can be accessed from any .NET language. \
 \
The flickrnet-devel package contains development files for flickrnet."
LICENSE = "LGPL-2.1+ | CPL-1.0"

PV = "3.5"

RPM_NAME = "flickrnet-devel-3.5-8.26.noarch.rpm"
RPM_HASH = "3f48f60a7e4438a764d320f4d4ddbfbf691df0ed3cae0fb27a99aff458461a7e787c6887a562d898adda6c20e8e13c025ae341a4cdce9b6013205daaa9a24088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flickrnet-devel \
pkgconfig-flickrnet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
flickrnet \
pkgconfig"

inherit rpm
