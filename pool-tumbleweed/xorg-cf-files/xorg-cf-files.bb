SUMMARY = "Data files for the imake utility"
DESCRIPTION = "The xorg-cf-files package contains the data files for the imake utility, \
defining the known settings for a wide variety of platforms (many of \
which have not been verified or tested in over a decade), and for many \
of the libraries formerly delivered in the X.Org monolithic releases. \
 \
The X Window System used imake extensively up through the X11R6.9 \
release, for both full builds within the source tree and external \
software. X has since moved to GNU autoconf and automake for its build \
system in X11R7.0 and later releases, but still maintains imake for \
building existing external software programs that have not yet \
converted."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "xorg-cf-files-1.0.9-3.3.noarch.rpm"
RPM_HASH = "ae90a6b1c172f7a37ce1f6e8ac7b6e3b0aac0757fd8ec8d887cdc0aa5391a19b93b54e3e37a26a722370b049952861205a908622ab40b04ffdf6e7a768f4db3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-cf-files"

RDEPENDS:${PN} += "gccmakedep \
imake \
makedepend"

inherit rpm
