SUMMARY = "OCI Registry Client in Go and tooling using those libraries"
DESCRIPTION = "Client interface for the registry API. This packages includes regctl for a \
command line interface to manage registries."
LICENSE = "Apache-2.0"

PV = "0.11.5"

RPM_NAME = "regclient-0.11.5-1.4.aarch64.rpm"
RPM_HASH = "0e98897ad0722751d49df950a7e3f03cded4468045ce91fbfba7529b52266e363eb18a1200ba2754e7f7ec5cd090d63665e339f14323b044427d70c7cba9adcf"

RPROVIDES:${PN} += "regclient"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
