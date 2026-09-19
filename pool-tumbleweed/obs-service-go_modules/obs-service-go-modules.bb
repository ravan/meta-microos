SUMMARY = "An OBS source service: Download, verify and vendor Go module dependencies"
DESCRIPTION = "An OBS Source Service that will download, \
verify and vendor Go module dependency sources. \
 \
Using go.mod and go.sum present in a Go application, \
the source service will call Go tools in sequence: \
 \
go mod download \
go mod verify \
go mod vendor \
 \
Then create a vendor.tar.gz populated with the contents of \
vendor/"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.9"

RPM_NAME = "obs-service-go_modules-0.6.9-1.4.noarch.rpm"
RPM_HASH = "efaa2ad97e04aacb900413d402ea69b8be45abf004e4ebff108bb18db7d8d4de7c24386ba6785afe0b0661650a52210d7fe0002f7a8e5023ce56e5609b070a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-go-modules"

RDEPENDS:${PN} += "/usr/bin/env \
golang-API \
python3-libarchive-c"

inherit rpm
