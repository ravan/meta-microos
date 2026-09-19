SUMMARY = "Pre-built CA certificates for OpenSSL"
DESCRIPTION = "This package contains a static set of CA root certificates for \
OpenSSL extracted from MozillaFirefox for use in containers. The \
package pre-fills /var/lib/ca-certificates with a static set of \
certificates if /var/lib/ca-certificates does not exist yet. \
 \
Therefore an upgrade of this package will NOT update the list of \
root CA certificates in the system. \
 \
It it not possible to configure additional root CA certificates \
using this package. \
 \
The package is only intended for use in containers that want to \
avoid installing p11-kit. \
 \
For all other use cases please install the \
'ca-certificates-mozilla' package."
LICENSE = "MPL-2.0"

PV = "2.84"

RPM_NAME = "ca-certificates-mozilla-prebuilt-2.84-1.8.noarch.rpm"
RPM_HASH = "865d43eb27424713e88f9d49346f0975967b237485f62ff252db89d7ebc41dd2cadff89ddeb798f9104854fb3bf8425ebc34e4274d2e10b34681425de744157d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-mozilla-prebuilt"

RDEPENDS:${PN} += "/usr/bin/cp \
/usr/bin/sh"

inherit rpm
