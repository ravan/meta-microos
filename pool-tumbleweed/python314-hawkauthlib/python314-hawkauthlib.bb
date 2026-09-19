SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python314-hawkauthlib-2.0.0-6.11.noarch.rpm"
RPM_HASH = "409cf132c8883c0fb14a356fa36dc91c252a8ad3b8c0c6cf7ea22853dc9d39861bc5913ca2068db65eb25aea78fa253f2ffa568ceeceb945e052762f6b9dd123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hawkauthlib \
python314-hawkauthlib \
python3dist-hawkauthlib"

RDEPENDS:${PN} += "python-abi \
python314-WebOb"

inherit rpm
